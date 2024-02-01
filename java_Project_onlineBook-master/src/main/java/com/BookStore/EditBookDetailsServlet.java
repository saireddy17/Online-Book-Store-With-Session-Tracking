package com.BookStore;
import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditBookDetailsServlet extends HttpServlet{
    @SuppressWarnings("unchecked")
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	HttpSession hs=req.getSession();
	if(hs==null)
	{
		req.setAttribute("msg","session Expired..<br>");
		req.getRequestDispatcher("Home.jsp").forward(req, res);
	}
	else {
		String bCode=req.getParameter("bcode");
		ArrayList<BookBean> al=(ArrayList<BookBean>)hs.getAttribute("alist");
		BookBean bb=null;
		Iterator<BookBean> it=al.iterator();
		while(it.hasNext())
		{
			bb=it.next();
			if(bCode.equals(bb.getCode())) {
			break;
			
		}
	}//end of loop
	req.setAttribute("bbean", bb);
	req.getRequestDispatcher("EditBookDetails.jsp").forward(req, res);
	
	}
    }
}
