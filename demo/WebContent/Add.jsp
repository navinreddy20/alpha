<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
Directive 
<%@ page import="java.util.Date,java.util.Scanner" %>  

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


// request, out, response, -> implicit
<body bgcolor="cyan">
	
		Declaration
		<%!
			int i = 5;
			 public void show()
			 {
				 System.out.println("in show");
			 }	
		
		%>
			
		Scriptlet
		<% 
	
		
			int n1 = Integer.parseInt(request.getParameter("num1"));
			int n2 = Integer.parseInt(request.getParameter("num2"));
			int result = 0;
			result = n1+n2;
			
			show();
			out.println(result);
		
		%>
		
		Expression
		<%= result %>


</body>
</html>