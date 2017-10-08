package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// CI -> Continous Integration

@WebServlet(urlPatterns="/myData",initParams={@WebInitParam(name="username",value="Vijay")})
public class MyDataServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		ServletContext context = getServletContext();
		
		String username = context.getInitParameter("username");
		
		PrintWriter out = res.getWriter();
		out.println("Hello " + username);
	}
}
