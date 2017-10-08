package com.telusko;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertData")
public class InsertServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			
		
			User u = new User();
			
			u.setUid(Integer.parseInt(request.getParameter("uid")));
			u.setUname(request.getParameter("uname"));
			u.setAge(Integer.parseInt(request.getParameter("age")));
			
			UserRepository repo = new UserRepository();
			repo.save(u);
			
		
	}

}
