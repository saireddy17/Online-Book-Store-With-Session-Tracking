<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.BookStore.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div{
  width:300px;
	height:100px;
	padding:40px;
	padding-left:50px;
	padding-right:60px;
	margin:auto;
	margin-top:50px;
	background-color:pink;
	}
	
	
</style>
</head>
<body>
<div>

	<%
	AdminBean ab = (AdminBean) session.getAttribute("abean");
	String msg = (String) request.getAttribute("msg");
	out.println("Page belongs to  : "+ab.getfName()+ "<br>");

	out.println(msg);
	%>
	<a href="book.html">AddBookDetails</a>
	<a href="view1">ViewAllBookDetails</a>
	<a href="logout">Logout</a>
	</div>
</body>
</html>