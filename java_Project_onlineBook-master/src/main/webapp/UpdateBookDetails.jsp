<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.BookStore.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println(msg);
out.println("Page Belogs to : "+ab.getfName()+"<br>");

%>
<a href="book.html">AddBookDetails</a>
<a href="view1">ViewAllBookDetails</a>
<a href="logout">Logout</a>
</body>
</html>