<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.BookStore.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

div{
width: 220px:
height:300px;
margin:auto;
padding:40px;
background-color:lavander;
}
hr{
background-color:black;
height:1px;
border:none;

}
</style>
</head>
<body>
<div>
<%
CustomerBean cb=(CustomerBean)session.getAttribute("cbean");
BookBean bb=(BookBean)request.getAttribute("bbean");
out.println("Page Belongs to..."+cb.getfName()+"<br>");
String msg=(String)request.getAttribute("msg");
if(msg!=null){
out.print(msg);
}
%>
<form action="modify" method="post">
        BookCode:<input type="text" name="code" value=<%=bb.getCode()%> ><br>
		BookName:<input type="text" name="name" value=<%=bb.getName() %> ><br>
		BookAuthor:<input type="text" name="author" value=<%=bb.getAuthor() %>><br>
		BookPrice:<input type="text" name="price" value=<%=bb.getPrice() %>><br>
		BookQty:<input type="text" name="qty" value=<%=bb.getQty() %>><br>

      RequiredBook:<input type="number" name="rqty"><br><br>
      <input type="submit" value="BuyBook">
</form>
</div>
</body>
</html>