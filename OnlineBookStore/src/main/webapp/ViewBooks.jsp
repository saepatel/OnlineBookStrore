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
AdminBean ab = (AdminBean)session.getAttribute("abean");
ArrayList<BookBean> al = (ArrayList<BookBean>)session.getAttribute("blist");
out.println("page Belongs To :" +ab.getFname()+"<br>");
Iterator<BookBean> it = al.iterator();
while(it.hasNext())
{
BookBean bb = it.next();
out.println(bb.getBcode()+"&nbsp&nbsp"+bb.getBname()+"&nbsp&nbsp"+bb.getBauthor()+"&nbsp&nbsp"+
bb.getBprice()+"&nbsp&nbsp"+bb.getBqty()+"&nbsp&nbsp"+
"<a href = 'edit?bcode="+bb.getBcode()+"'>EDIT</a>"+"&nbsp&nbsp"+
"<a href = 'delete?bcode="+bb.getBcode()+"'>DELETE</a>"+"<br>");
}
%>
<a href = "logout">Logout</a>
</body>
</html>
