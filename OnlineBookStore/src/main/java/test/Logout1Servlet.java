package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/logout1")
public class Logout1Servlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired...");
           req.getRequestDispatcher("Home1.jsp").forward(req, res);			
		}
		else 
		{
			hs.invalidate();
			req.getRequestDispatcher("Logout.jsp").forward(req, res);
		}
	}

}

