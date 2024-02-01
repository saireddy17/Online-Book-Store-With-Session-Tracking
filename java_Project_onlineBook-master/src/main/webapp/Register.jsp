<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
div{
width:190px;
margin: auto;
background-color: lavander;

}
</style>
</head>
<body>
<div>
<%
String msg=(String)request.getAttribute("msg");
out.println(msg);
%>
<jsp:include page="customerLogin.html"/>
</div>
</body>
</html>