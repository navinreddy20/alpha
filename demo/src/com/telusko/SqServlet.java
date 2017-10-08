package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SqServlet
 */
@WebServlet("/SqServlet")
public class SqServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
			
		HttpSession session = request.getSession();
		int result = (int)session.getAttribute("r");
		out.println(result*result);
		
		
		// MVC
		
	}

}
