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
String msg = (String)request.getAttribute("msg");
out.println("Page Belongs to :" +rb.getFname()+"<br>");
out.println(msg);
%>
<br>
<a href = "viewcustomer">View All Books</a><br>
<a href = "logout1">Logout</a><br>
</body>
</html>
