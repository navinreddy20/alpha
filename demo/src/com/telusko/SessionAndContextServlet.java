package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/example")
public class SessionAndContextServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		String str = request.getParameter("t1");
	
		Cookie c = new Cookie("name", str);
		Cookie c1 = new Cookie("age","28");
		response.addCookie(c);
		response.addCookie(c1);
		PrintWriter out = response.getWriter();
		
		response.sendRedirect("display"); // display/t1=Navin
		
		
		
		
		
	}

}
