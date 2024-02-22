
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
import = "test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");
out.println("Page belongs to : " +ab.getFname()+"<br>");
out.println("Book Details Deleted Successfully.....");
%>
<br>
<a href = "Add.html">Add Book Details</a><br>
<a href = "viewbooks">View All Book Details</a><br>
<a href = "logout">LogOut</a>
</body>
</html>
