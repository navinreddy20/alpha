package com.telusko.web;

// java based and modelAndView


import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AlienController 
{
	//List<Alien> aliens = new ArrayList<Alien>();
	
	@Autowired
	AlienRepository dao;
	
	@RequestMapping(value="aliens",produces= {"application/json","application/xml"})
	public List<Alien> getAliens()
	{
		return dao.findAll();
	}
	
	@GetMapping("alien/{aid}")
	public Alien getAlien(@PathVariable int aid)
	{
		return dao.findOne(aid);
	}
	
	@PostMapping(value="alien",consumes= {"application/json"})
	public Alien addAlien(@RequestBody Alien alien)
	{
		dao.save(alien);
		
		return alien;
	}
	
	
}




