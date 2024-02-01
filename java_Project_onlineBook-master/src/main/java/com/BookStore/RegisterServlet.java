package com.BookStore;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/reg1")
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		CustomerBean cb=new CustomerBean();
		cb.setuName(req.getParameter("uname"));
		cb.setpWord(req.getParameter("pword"));
		cb.setfName(req.getParameter("fname"));
		cb.setlName(req.getParameter("lname"));
		cb.setAddr(req.getParameter("addr"));
		cb.setmId(req.getParameter("mid"));
		cb.setPhNo(Long.parseLong(req.getParameter("phno")));
		int k=new RegisterDAO().Register(cb);
		if(k>0)
		{
			req.setAttribute("msg","Customer Registration Successfull....<br>");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
	}

}
