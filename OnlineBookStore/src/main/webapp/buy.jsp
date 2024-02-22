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
%>
<form action = "buy1" method = "post">
<input type = "text" name = "bcode" readonly value =<%=bb.getBcode() %>><br>
<input type = "text" name = "bname" readonly value=<%=bb.getBname() %>><br>
<input type = "text" name = "bauthor" readonly value = <%=bb.getBauthor() %>><br>
<input type = "text" name = "bprice" readonly value = <%=bb.getBprice() %>><br>
<input type = "text" name = "bqty" readonly value = <%=bb.getBqty() %>><br>
<input type = "number" name = "value" min=1 max=<%=bb.getBqty() %>><br>
<input type = "submit" value = "buy">
</form>
<a href = "logout1">Logout</a><br>
</body>
</html>
