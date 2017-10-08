package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


// RequestDispatcher , redirect
@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out = res.getWriter();
		
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		int result = 0;
		result = n1+n2;
		
	//	req.setAttribute("r", result);
		
//		RequestDispatcher rd = req.getRequestDispatcher("SqServlet");
//		rd.forward(req, res);
		
		HttpSession session = req.getSession();
		session.setAttribute("r", result);
		// Session Management
		res.sendRedirect("SqServlet");
		
		
		
		
		out.print("<html>");
		out.println("<body bgcolor='cyan'>");
		out.println(result);
		out.println("</body></html");
	}
	
	
}

// JSP -> JavaServer Pages


