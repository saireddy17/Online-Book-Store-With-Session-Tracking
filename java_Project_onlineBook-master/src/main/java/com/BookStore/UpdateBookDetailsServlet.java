package com.BookStore;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateBookDetailsServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg","Session Exception..<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else {
			String bCode= req.getParameter("bcode");
			@SuppressWarnings("unchecked")
			ArrayList<BookBean> al=(ArrayList<BookBean>)hs.getAttribute("alist");
			BookBean bb=null;
			Iterator<BookBean> it=al.iterator();
			while(it.hasNext())
			{
				bb=it.next();
				if(bCode.equals(bb.getCode()))
				{
					break;
				}
			}
			bb.setPrice(Float.parseFloat(req.getParameter("bprice")));
			bb.setQty(Integer.parseInt(req.getParameter("bqty")));
			int k=new UpdateBookDetailsDAO().update(bb);
			if(k>0)
			{
				req.setAttribute("msg", "Book Details Updated succcessfully..<br>");
                req.getRequestDispatcher("UpdateBookDetails.jsp").forward(req, res);
			}
		}
	}
}
