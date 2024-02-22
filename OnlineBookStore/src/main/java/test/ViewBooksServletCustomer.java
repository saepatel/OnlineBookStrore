package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.util.*;
@SuppressWarnings("serial")
@WebServlet("/viewcustomer")
public class ViewBooksServletCustomer extends HttpServlet
{
@SuppressWarnings("null")
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	HttpSession hs = req.getSession();
	if(hs==null)
	{
		hs.setAttribute("msg","session Expired...");
		req.getRequestDispatcher("Home1.jsp").forward(req, res);
	}
	else
	{
		ArrayList<BookBean> al = new ViewBooksCustomerDAO ().view();
		if(al==null)
		{
			req.setAttribute("msg", "Books are empty...");
			req.getRequestDispatcher("view3.jsp").forward(req, res);
		}
		else {
		hs.setAttribute("alist2",al);
		req.getRequestDispatcher("view2.jsp").forward(req, res);
		}
		
	}
}
}


