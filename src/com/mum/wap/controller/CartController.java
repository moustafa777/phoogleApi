package com.mum.wap.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mum.wap.data.FillystemData;
import com.mum.wap.service.CartService;

import model.Phone;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/cart")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	private CartService cartService;

	public CartController() {
		super();
		// TODO Auto-generated constructor stub

		cartService = new CartService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String json = getPhonesForCart();

			response.setContentType("application/json;charset=UTF-8");

			ServletOutputStream out = response.getOutputStream();

			out.print(json);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// response.getWriter().append("Served at: ").append(request.getContextPath());
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(request.getParameter("brand"));

		String body = request.getParameter("brand");

		if (body.length() != 0) {
			try {
				addToCart(body);
				ServletOutputStream out = response.getOutputStream();

				out.print("success");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			ServletOutputStream out = response.getOutputStream();

			out.print("body must be sent in form-data formate with key and value parameter");
		}

	}

	private void addToCart(String deviceName) throws Exception {

		cartService.addToCart(deviceName);

	}

	private String getPhonesForCart() throws Exception {
		List<Phone> phones = FillystemData.getCardItems();

		ObjectMapper mapper = new ObjectMapper();

		String x = mapper.writeValueAsString(phones);
		return x;

	}

}
