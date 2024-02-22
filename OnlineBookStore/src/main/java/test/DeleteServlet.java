package test;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
HttpSession hs = req.getSession(false);
if(hs == null)
{
req.setAttribute("msg", "Sesion Expired...");
req.getRequestDispatcher("Home.jsp").forward(req, res);
}
else
{
ArrayList<BookBean> al = (ArrayList<BookBean>)hs.getAttribute("blist");	
BookBean bb = null;
Iterator<BookBean> it = al.iterator();
while(it.hasNext())
{
bb=it.next();
if(req.getParameter("bcode").equals(bb.getBcode()))
{
break;	
}
}
//al.remove(bb);
int k =new DeleteDAO().delete(req.getParameter("bcode"));
if(k>0)
{
	req.getRequestDispatcher("Delete.jsp").forward(req, res);
}

}
}
}

