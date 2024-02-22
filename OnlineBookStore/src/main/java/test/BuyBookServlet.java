package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.util.*;
@WebServlet("/buy2")
public class BuyBookServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "session Expired...");
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
			int p = Integer.parseInt(req.getParameter("bqty"));
			bb.setBqty(bb.getBqty()-p);
			int k =new BuyBookDAO().buy(bb);
			if(k>0)
			{
				req.getRequestDispatcher("buybook.jsp").forward(req, res);
			}
		}
		
		
	}

}


