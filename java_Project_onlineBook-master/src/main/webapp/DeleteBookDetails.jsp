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
AdminBean ab=(AdminBean)session.getAttribute("abean");
BookBean bb=(BookBean)request.getAttribute("bbean");
out.println("Page belongs to : "+ab.getfName()+"<br><hr>");

%>
<form action ="delete" method="get">

BookCode:<input type="text" name="bcode" value=<%=bb.getCode()%>><br>

<input type="submit" value="DeleteRecord"> 

</form>

</div>
</body>
</html>