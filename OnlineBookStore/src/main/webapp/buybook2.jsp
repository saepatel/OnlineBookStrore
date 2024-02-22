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
BookBean bb = (BookBean)request.getAttribute("bb");
float price = (float)request.getAttribute("bprice");
int qty = (int)request.getAttribute("qty1");
%>
<form action = "buy2" method = "post">
<input type = "text" name = "bcode" readonly value =<%=bb.getBcode() %>><br>
<input type = "text" name = "bname" readonly value=<%=bb.getBname() %>><br>
<input type = "text" name = "bauthor" readonly value = <%=bb.getBauthor() %>><br>
<input type = "text" name = "bprice" readonly value = <%out.println(price);%>><br>
<input type = "text" name = "bqty" readonly value = <%out.println(qty);%>><br>
<h2>Select Payment Type :</h2><br>
<input type = "submit" value = "Phonepe"><br>
<input type = "submit" value = "Gpay"><br>
<input type = "submit" value = "Paytm"><br>
<input type = "submit" value = "NetBanking"><br>
</form>
<a href = "viewcustomer">Cancel Transaction</a><br>
<a href = "logout1">Logout</a>
</body>
</html>
