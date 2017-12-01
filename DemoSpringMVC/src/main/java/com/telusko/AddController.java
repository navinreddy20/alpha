package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Multiaction controllers

@Controller
public class AddController 
{
	@RequestMapping("add")
	public String add(@RequestParam("t1") int num1,@RequestParam("t2") int num2, HttpSession session)
	{
		int result = num1 + num2;
		session.setAttribute("result", result);
		return "result.jsp";
	}
	
	@RequestMapping("sub")
	public String sub(@RequestParam("t1") int num1,@RequestParam("t2") int num2, HttpSession session)
	{
		int result = num1 - num2;
		session.setAttribute("result", result);
		return "result.jsp";
	}
}
