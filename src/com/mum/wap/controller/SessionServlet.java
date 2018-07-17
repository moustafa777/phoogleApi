package com.mum.wap.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/Session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String username;

		Cookie cookies[] = request.getCookies();

		if (cookies != null) {
			for (Cookie ck : cookies) {
				if (ck.getName().equals("phoogleUsername")) {
					request.getSession().setAttribute("phoogleUsername", ck.getValue());
				}
			}
		}

		try {
			username = session.getAttribute("phoogleUsername").toString();
			ObjectMapper mapper = new ObjectMapper();
			String x = mapper.writeValueAsString(username);
			ServletOutputStream out = response.getOutputStream();
			out.print(x);
		} catch (Exception e) {
//			in case no sesssion avaliable

			response.sendError(588, "Session not found.");
		}

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

}
