package com.BookStore;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteBookDetailsServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
	HttpSession hs=req.getSession();
	//System.out.println(hs);
	if(hs==null)
	{
		req.setAttribute("msg", "session Expired..<br>");
		req.getRequestDispatcher("Home.jsp").forward(req, res);

	}
	else
	{
		String bCode=req.getParameter("bcode");
		@SuppressWarnings("unchecked")
		ArrayList<BookBean> al=(ArrayList<BookBean>)hs.getAttribute("alist");
		BookBean bb=null;
		Iterator<BookBean> it=al.iterator();
		while(it.hasNext())
		{
			bb=it.next();
			if(bCode.equals(bb.getCode())) {
				break;
			}
		}
		

		//req.setAttribute("bbean", bb);
		//System.out.println(bb);
		int k=new DeleteBookDetailsDAO().delete(bb);
		//modifiyng code
		if(k>0)
		{
			req.setAttribute("msg","Book Record deleted Successfully...<br>");
			
			req.getRequestDispatcher("DeleteRecord.jsp").forward(req, res);
		}
		//req.setAttribute("msg","Book Record deleted Successfully...<br>");
		//req.getRequestDispatcher("DeleteBookDetails.jsp").forward(req, res);
		//res.sendRedirect("DeleteRecord.jsp");
	}
	
	
	}
      
}
