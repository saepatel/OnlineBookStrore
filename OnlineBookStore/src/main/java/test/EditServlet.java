package test;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/edit")
public class EditServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg","Session expired..");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			@SuppressWarnings("unchecked")
			String bcode = req.getParameter("bcode");
			ArrayList<BookBean> al = (ArrayList<BookBean>)hs.getAttribute("blist");
			BookBean bb = null;
			Iterator<BookBean> it = al.iterator();
					while(it.hasNext())
					{
						bb=it.next();
						if(bcode.equals(bb.getBcode()))
						{
							break;
						}
					}
					req.setAttribute("bb",bb);
			req.getRequestDispatcher("Edit.jsp").forward(req, res);
			
		}
	}

}

