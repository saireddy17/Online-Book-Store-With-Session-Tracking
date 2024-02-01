<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.BookStore.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div{
width:200px;
height:70px;
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
String bp=(String)request.getAttribute("bp");
String msg=(String)request.getAttribute("msg");
out.println("Page belongs to:"+cb.getfName()+"<br><hr>");
out.println("Total Amount paid:"+(bb.getPrice()*(Integer.parseInt(bp)))+"<br>");
out.println(msg);

%>
<a href="view2">ViewAllBookDetails</a>&nbsp;&nbsp;
<a href="logout">Logout</a>
</div>
</body>
</html>