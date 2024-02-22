package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		RegisterBean rb = new RegisterBean();
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired....<br>");
			req.getRequestDispatcher("Home1.jsp").forward(req, res);
		}
		else
		{
			
			rb.setUname(req.getParameter("uname"));
			rb.setPword(req.getParameter("pword"));
			rb.setFname(req.getParameter("fname"));
			rb.setLname(req.getParameter("lname"));
			rb.setAddr(req.getParameter("addr"));
			rb.setMid(req.getParameter("mid"));
			rb.setPhno(Long.parseLong(req.getParameter("phno")));
			int k= new RegisterDAO().insert(rb);
			if(k>0)
			{
				req.setAttribute("msg", "Customer Registered Successfully...");
				req.getRequestDispatcher("Register.jsp").forward(req, res);
			}
			
			
		}
		
		
	}

}


