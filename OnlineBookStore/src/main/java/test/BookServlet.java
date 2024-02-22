package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/add")
public class BookServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	HttpSession hs = req.getSession(false);
	if(hs==null) 
	{
		req.setAttribute("msg", "Session Expired");
		req.getRequestDispatcher("Home.jsp").forward(req, res);
	}
	else
	{
		BookBean bb = new BookBean();
		bb.setBcode(req.getParameter("bcode"));
		bb.setBname(req.getParameter("bname"));
		bb.setBauthor(req.getParameter("bauthor"));
		bb.setBprice(Float.parseFloat(req.getParameter("bprice")));
		bb.setBqty(Integer.parseInt(req.getParameter("bqty")));
		int k = new BookDAO().insert(bb);
		if(k>0)
		{
			req.setAttribute("msg", "Book Details Inserted Succeessfully");
			req.getRequestDispatcher("Book.jsp").forward(req, res);
		}
		
	}
}
}
