package test;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/buy")
public class BuyServlet1 extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
HttpSession hs = req.getSession();
if(hs==null)
{
req.setAttribute("msg","Session Expired...");
req.getRequestDispatcher("Home1.jsp").forward(req, res);
}
else
 { 
	BookBean bb =null;
	ArrayList<BookBean> al = (ArrayList<BookBean>)hs.getAttribute("alist2");
	Iterator<BookBean> it = al.iterator();
	while(it.hasNext())
	{
		 bb = it.next();
		if(req.getParameter("bcode").equals(bb.getBcode()))
		{
			break;
		}
	}
	req.setAttribute("bb", bb);
	req.getRequestDispatcher("buy.jsp").forward(req, res);
 }
}
}

