package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/clogin")
public class CustomerLoginServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	HttpSession hs = req.getSession();
	if(hs==null)
	{
		req.setAttribute("msg","Session Expired....");
		req.getRequestDispatcher("Home1.jsp").forward(req, res);
	}
	else
	{
		RegisterBean rb = new CustomerLoginDAO().retrieve(req.getParameter("uname"),req.getParameter("pword"));
		if(rb ==null)
		{
			req.setAttribute("msg", "Invalid Login Credintials.....");
			req.getRequestDispatcher("Home1.jsp").forward(req, res);
		}
		else
		    hs.setAttribute("rbean", rb);
		req.setAttribute("msg", "Customer Login Successfully.....");
		req.getRequestDispatcher("Customerlogin.jsp").forward(req, res);
		
	}
}
}
