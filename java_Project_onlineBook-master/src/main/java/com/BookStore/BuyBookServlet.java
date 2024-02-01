package com.BookStore;
import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/buy")
public class BuyBookServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg" ,"Session Expired..<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}else
		{
			String bCode=req.getParameter("code");
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
			}//end of while loop
			if(bb.getQty()<=0) {
//				PrintWriter pw=res.getWriter();
//				pw.print("Books not avilable");
				//req.setAttribute("bbean", bb);
				req.setAttribute("msg", "out of stock..<br>");
				req.getRequestDispatcher("ViewAllBooksCust.jsp").forward(req, res);
			}else {
			req.setAttribute("bbean", bb);
			req.getRequestDispatcher("BuyBook.jsp").forward(req, res);
			
		}
		}
	}
}
