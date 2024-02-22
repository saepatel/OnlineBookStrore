<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
import = "test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");
out.println("Welcome user : "+ab.getFname());
out.println("Login SuccessFully...<br>");
%>
<a href = "Add.html">Add Book Details</a><br>
<a href = "viewbooks">View All Books</a><br>
<a href= "logout" >Logout</a><br>
</body>
</html>
