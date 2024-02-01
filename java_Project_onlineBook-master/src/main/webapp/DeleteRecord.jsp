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
width:330px;
height:50px;
margin:auto;
padding:40px;
background-color:lavender;

}
hr{
background-color: black;
height: 1px;
border: none;

}
</style>
</head>
<body>
<div>
<%

out.println("Book Record deleted successfully...<br><hr>");
%>
<a href="book.html">AddBookDetails</a>
<a href="view1">ViewAllBookDetails</a>
<a href="logout">Logout</a>
</div>
</body>
</html>