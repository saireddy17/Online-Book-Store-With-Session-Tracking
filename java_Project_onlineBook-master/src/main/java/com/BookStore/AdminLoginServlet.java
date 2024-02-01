package com.BookStore;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/adminLog")
public class AdminLoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		AdminBean ab = new AdminLoginDAO().login(req.getParameter("uname"), req.getParameter("pword"));
		if (ab == null) {
			req.setAttribute("msg", "invalid Login process..<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		} else {
			HttpSession hs = req.getSession();// creating new session
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("AdminLogin.jsp").forward(req, res);
		}
	}

}
