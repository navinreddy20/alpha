package com.telusko;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fetchData")
public class UserController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int uid = Integer.parseInt(request.getParameter("uid"));
		
		UserRepository repo = new UserRepository();
		
		User u = repo.getUser(uid);
		
		request.setAttribute("user", u);
		
		RequestDispatcher rd = request.getRequestDispatcher("userdetails.jsp");
		
		rd.forward(request, response);
		
	}

	
}
