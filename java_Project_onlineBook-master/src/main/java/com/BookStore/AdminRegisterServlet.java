package com.BookStore;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class AdminRegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		AdminBean ab = new AdminBean();
		ab.setuName(req.getParameter("uname"));
		ab.setpWord(req.getParameter("pword"));
		ab.setfName(req.getParameter("fname"));
		ab.setlName(req.getParameter("lname"));
		ab.setAddr(req.getParameter("addr"));
		ab.setmId(req.getParameter("mid"));
		ab.setPhNo(Long.parseLong(req.getParameter("phno")));
		int k = new AdminRegisterDAO().register(ab);
		if (k > 0) {
			req.setAttribute("msg", "User REGISTERED Successfully ..<br>");
			RequestDispatcher rd = req.getRequestDispatcher("AdminRegister.jsp");
			rd.forward(req, res);
		}

	}

}
