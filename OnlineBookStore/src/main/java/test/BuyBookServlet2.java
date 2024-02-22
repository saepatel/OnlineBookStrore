package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/buy1")
public class BuyBookServlet2 extends HttpServlet

{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
HttpSession hs = req.getSession(false);
if(hs==null)
{
req.setAttribute("msg", "Session Expired...");
req.getRequestDispatcher("Home1.jsp").forward(req, res);
}
else
{
	BookBean bb = null;
	ArrayList<BookBean> al = (ArrayList<BookBean>)hs.getAttribute("alist2");
	Iterator<BookBean> it = al.iterator();
	while(it.hasNext())
	{
		bb =it.next();
		if(req.getParameter("bcode").equals(bb.getBcode()))
		{break;}
	}
float price = Float.parseFloat(req.getParameter("bprice"));
int qty1=Integer.parseInt(req.getParameter("value"));
req.setAttribute("bprice", price*qty1);
req.setAttribute("qty1",qty1);
req.setAttribute("bb", bb);
req.getRequestDispatcher("buybook2.jsp").forward(req, res);
}
}
}

