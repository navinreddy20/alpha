package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.telusko.dao.AlienDao;

@Controller
public class AlienController 
{
	@Autowired
	AlienDao dao;
	
	@RequestMapping(path="alien",method=RequestMethod.POST)
	public String addAlien(@ModelAttribute("a") Alien alien)
	{
		System.out.println(alien);
		
		dao.saveAlien(alien);
		
		
		return "showAlien.jsp";
	}
	
	@GetMapping("alien")
	public String getAlien()
	{
		return "showAlien.jsp";
	}
	
	@ModelAttribute("myAlien")
	public Alien populateAlien()
	{
		Alien a  = new Alien();
		a.setAname("DP");
		a.setTech("Cloud");
		return a;
	}
	
}
