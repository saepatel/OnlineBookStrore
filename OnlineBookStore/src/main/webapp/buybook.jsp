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
RegisterBean rb = (RegisterBean)session.getAttribute("rbean");
out.println("page Belongs to :" +rb.getFname());
out.println("<br>Book Buy Successfully<br>");
%>
<a href = "viewcustomer">View All Books</a><br>
<a href = "logout1">Logout</a><br>
</body>
</html>
