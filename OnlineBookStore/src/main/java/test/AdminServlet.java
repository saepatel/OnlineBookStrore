package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/alogin")
public class AdminServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
AdminBean ab = new AdminDAO().insert(req.getParameter("uname"),req.getParameter("pword"));
if(ab==null)
{
req.setAttribute("msg","Invalid UserName or Password");
req.getRequestDispatcher("Home.jsp").forward(req, res);
}
else 
{
HttpSession hs = req.getSession();
hs.setAttribute("abean", ab);
req.getRequestDispatcher("View1.jsp").forward(req, res);
}
}
}

