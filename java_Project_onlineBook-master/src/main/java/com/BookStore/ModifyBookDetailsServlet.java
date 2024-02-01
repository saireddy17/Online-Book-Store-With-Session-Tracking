package com.BookStore;
import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/modify")
public class ModifyBookDetailsServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired...<br><br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}else
		{
			String bCode=req.getParameter("code");
			ArrayList<BookBean> al=(ArrayList<BookBean>)hs.getAttribute("alist");
			BookBean bb=null;
			Iterator<BookBean>it=al.iterator();
			while(it.hasNext())
			{
				bb=it.next();
				if(bCode.equals(bb.getCode()))
				{
				break;
				}
			}
			//bb.setQty((Integer.parseInt(req.getParameter("qty")))-(Integer.parseInt(req.getParameter("rqty"))));
			int qty=(Integer.parseInt(req.getParameter("qty")));
			int rqty=(Integer.parseInt(req.getParameter("rqty")));
			int sum=qty-rqty;
			if(qty<rqty) {
				req.setAttribute("bp",req.getParameter("rqty"));
				req.setAttribute("bbean",bb);
				req.setAttribute("msg","Enter enough qty<br>");
				req.getRequestDispatcher("BuyBook.jsp").forward(req, res);
			}
			else {
				bb.setQty(sum);
			int k=new ModifyBookDetailsDAO().modify(bb);
			if(k>0)
			{
				req.setAttribute("bp",req.getParameter("rqty"));
				req.setAttribute("bbean",bb);
				req.setAttribute("msg","Payment Successfull,<br>");
				req.getRequestDispatcher("ModifyBookDetails.jsp").forward(req, res);
			}
			}
		}
	}
}
