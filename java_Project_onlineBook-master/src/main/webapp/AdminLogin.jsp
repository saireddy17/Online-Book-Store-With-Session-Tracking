<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.BookStore.AdminBean"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  div{
      width:350px;
height:50px;
margin:auto;
padding:60px;
background-color:lavender;

}
a{
     font-size:18px;
}
</style>
</head>
<body>
<div>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("Welcome Admin: "+ab.getfName()+"<br><br>");
%>
<a href="book.html">AddBookDetails</a>
<a href="view1">ViewAllBookDetails</a>
<a href="logout">Logout</a>
</div>
</body>
</html>