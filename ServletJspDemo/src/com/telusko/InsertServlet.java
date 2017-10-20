package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertData")
public class InsertServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("In Servlet");
		
		PrintWriter out = response.getWriter();
//		int age = Integer.parseInt(request.getParameter("age"));
//		
//			User u = new User();
//			
//			u.setUid(Integer.parseInt(request.getParameter("uid")));
//			u.setUname(request.getParameter("uname"));
//			u.setAge(age);
//			
//			UserRepository repo = new UserRepository();
//			//repo.save(u);
//			
			out.println("Data Saved");
		
		
	}

}
