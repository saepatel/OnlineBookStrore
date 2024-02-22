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
String msg = (String)request.getAttribute("msg");
out.println("page Belongs to :" +ab.getFname());
out.println(msg);
%>
<br>
<a href = "Add.html">Add Book Details</a><br>
<a href = "viewbooks">View All Book Details</a><br>
<a href = "logout">LogOut</a>
</body>
</html>
