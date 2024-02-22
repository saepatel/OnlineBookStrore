package test;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/update")
public class UpdateServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg","Session Expired...");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else 
		{
			ArrayList<BookBean> al = (ArrayList<BookBean>)hs.getAttribute("blist");
			BookBean bb = null;
			Iterator<BookBean> it = al.iterator();
			while(it.hasNext())
			{
				bb = it.next();
				if(req.getParameter("bcode").equals(bb.getBcode()))
				{
					
					break;
				}
			}
			bb.setBprice(Float.parseFloat(req.getParameter("bprice")));
			bb.setBqty(Integer.parseInt(req.getParameter("bqty")));
			int k = new UpdateDAO().update(bb);
			if(k>0)
			{
				req.setAttribute("msg","Book Details Updated Successfully....");
				req.getRequestDispatcher("update.jsp").forward(req, res);
			}
			
		}
		
	}

}

