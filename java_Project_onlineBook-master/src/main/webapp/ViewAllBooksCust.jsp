<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.BookStore.*,java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
CustomerBean cb=(CustomerBean)session.getAttribute("cbean");
ArrayList<BookBean> al=(ArrayList<BookBean>)session.getAttribute("alist");
out.println("Page belongs to: "+cb.getfName()+"<br>");
String msg=(String)request.getAttribute("msg");

if(msg!=null){
	out.println(msg+"pls contact admin...<br><br>");
	
}
if(al.size()==0)
{
	
	out.println("Book not Available...<br>");
	
}else
{
	Iterator<BookBean> it=al.iterator();
	while(it.hasNext())
	{
		BookBean bb=it.next();
		out.println(bb.getCode()+"&nbsp&nbsp"
		        +bb.getName()+"&nbsp&nbsp"
				+bb.getAuthor()+"&nbsp&nbsp"
				+bb.getPrice()+"&nbsp&nbsp"
				+bb.getQty()+"&nbsp&nbsp"+"&nbsp&nbsp"
				+"<a href='buy?code="+bb.getCode()+"'>Buy</a>"+"<br>");
	}
}
%>
<a href="logout">Logout</a>
</body>
</html>