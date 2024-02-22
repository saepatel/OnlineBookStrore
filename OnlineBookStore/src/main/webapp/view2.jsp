<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
import = "test.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
</style>
</head>
<body>
<div
style="
margin-left:90%;
height:30px;
color:#ffffff;
background-color:#ffffff;
"
>
<a href = "logout1">Logout</a><br></div>
<table border align="center" width="1000px">
<tr>
<th>Book-Code</th><th>Book-Name</th><th>Book-Author</th><th>Book-Price</th><th>Book-Quanttity</th>
<th>Buy-Books</th>
</tr>
<%
RegisterBean rb = (RegisterBean)session.getAttribute("rbean");
out.println("<div >Page Belongs To : "+rb.getFname()+"</div><br>");
ArrayList<BookBean> al = (ArrayList<BookBean>)session.getAttribute("alist2");
Iterator<BookBean> it = al.iterator();
while(it.hasNext())
{
BookBean bb = it.next();
out.println("<tr align='center'> <td>"+bb.getBcode()+"</td><td>"+bb.getBname()+"</td><td>"+
bb.getBauthor()+"</td><td>"+bb.getBprice()+"</td><td>"+bb.getBqty()
+"</td><td><a href='buy?bcode="+bb.getBcode()+"'>Buy Books</a></td></tr>");
}
%>
</table>
</body>
</html>
