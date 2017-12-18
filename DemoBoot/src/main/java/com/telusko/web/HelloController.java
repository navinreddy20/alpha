package com.telusko.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController 
{
	@RequestMapping("greet")
	public String greet()
	{
		Alien a1 = new Alien();
		a1.setId(101);
		a1.setAname("Navin");
		a1.setTech("Java");
		return "showAlien.jsp";
	}
}
