package com.mum.wap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mum.wap.service.PhoneService;

import model.Phone;

/**
 * Servlet implementation class PhoneContollerServlet
 */
@WebServlet("/search")
public class PhoneContollerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PhoneService phoneService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PhoneContollerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameterMap().containsKey("brand")) {

			try {
				String json = getAllPhoneForBrand(request.getParameter("brand"));

				response.setContentType("application/json;charset=UTF-8");

				ServletOutputStream out = response.getOutputStream();

				out.print(json);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 

	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void init() throws ServletException {

		phoneService = new PhoneService();
	}

	private String getAllPhoneForBrand(String brand) throws Exception {

		List<Phone> phones = phoneService.getAllPhoneForBrand(brand);

		ObjectMapper mapper = new ObjectMapper();

		String x = mapper.writeValueAsString(phones);
		return x;

	}
	
}
