<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import= "com.BookStore.CustomerBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

div{
width:200px;
height:50px;
padding:40px;
margin:auto;
background-color:yellow;
}
hr{
height:1px;
background-color:black;
border:none;
}

</style>
</head>
<body>
<div>

<%
CustomerBean cb=(CustomerBean)session.getAttribute("cbean");
out.println("Welcome Customer: "+cb.getfName()+"<br><hr>");
%>
<a href="view2">ViewAllBookDetails</a>&nbsp;&nbsp;
<a href="logout">Logout</a>

</div>
</body>
</html>