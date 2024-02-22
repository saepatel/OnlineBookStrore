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
out.println("page Belongs to :" +rb.getFname());
out.printll("<br>"+msg);
%>
<a href = "logout1">Logout</a><br>
</body>
</html>
