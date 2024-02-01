<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.BookStore.*,java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div{
width:350px;
height:150px;
margin:auto;
padding:50px;
background-color:pink;

}
hr{
background-color: black;
height: 1px;
border: none;

}
a:hover{
background-color:yellow;
}
.link{
position:static;
margin-right: 150px;
padding-top:10px;
}
</style>
</head>
<body>
<div>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
ArrayList<BookBean> al=(ArrayList<BookBean>)session.getAttribute("alist");
out.println("Page Belongs to : "+ab.getfName()+"<br><hr>");
if(al.size()==0)
{
	out.println("Books not Available...<br><hr>");
	
}else
{
	Iterator<BookBean> it=al.iterator();
	while(it.hasNext()){
		BookBean bb=it.next();
		out.println(bb.getCode()+"&nbsp&nbsp"
		           +bb.getName()+"&nbsp&nbsp"
				   +bb.getAuthor()+"&nbsp&nbsp"
		           +bb.getPrice()+"&nbsp&nbsp"
				   +bb.getQty()+"&nbsp&nbsp"
		           +"<a href='edit?bcode="+bb.getCode()+"'>Edit</a>"+"&nbsp&nbsp"
		           
				   +"<a href='delete?bcode="+bb.getCode()+"'>Delete</a>"+"<br><hr>");

	}
}

%>
<a href="logout" class="link">Logout</a>
</div>
</body>
</html>