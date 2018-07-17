package com.mum.wap.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mum.wap.dao.UserDAO;
import com.mum.wap.service.User;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet({ "/Login", "" })
public class LoginControllerServelet extends HttpServlet {
	private UserDAO userDao;
	ObjectMapper mapper = new ObjectMapper();

	@Override
	public void init() throws ServletException {
		userDao = new UserDAO();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameterMap().containsKey("username") && req.getParameterMap().containsKey("password")) {

			try {
				String uname = req.getParameter("username");
	            String upass = req.getParameter("password");
	            
				String json = getUserByCredential(uname, upass);
				if(json.equals("null"))
				{
					resp.sendError(HttpServletResponse.SC_FORBIDDEN,"Username Or Password wrong");
				}
				HttpSession session = req.getSession();
				session.setAttribute("phoogleUsername", uname);
				
				Cookie usercookie = new Cookie("phoogleUsername", uname);
				usercookie.setMaxAge(60 * 60 * 24 * 365 * 10);
                resp.addCookie(usercookie);

				resp.setContentType("application/json;charset=UTF-8");

				ServletOutputStream out = resp.getOutputStream();
				
				HttpSession session2 = req.getSession();
				String username = session2.getAttribute("phoogleUsername").toString();
				ObjectMapper mapper = new ObjectMapper();

				out.print(json);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

	private String getUserByCredential(String username, String password) throws Exception {

		User user = userDao.getUserByCredential(username, password);

		ObjectMapper mapper = new ObjectMapper();

		String x = mapper.writeValueAsString(user);
		return x;

	}
}
