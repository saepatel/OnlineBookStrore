<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
import = "test.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
BookBean bb = (BookBean)request.getAttribute("bb");
AdminBean ab = (AdminBean)session.getAttribute("abean");
out.println("Page Belongs To....."+ab.getFname());
%>
<br>
<form action = "update" method = "post">
<input type = "hidden" name = "bcode" value = <%=bb.getBcode() %>><br>
BookPrice<input type = "text" name = "bprice" value = <%=bb.getBprice() %>><br>
BookQuantity<input type = "text" name = "bqty" value = <%=bb.getBqty() %>><br>
<input type = "submit" value = "edit">
</form>
</body>
</html>
