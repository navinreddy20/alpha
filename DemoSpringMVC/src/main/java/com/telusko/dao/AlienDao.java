package com.telusko.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telusko.Alien;

@Component
public class AlienDao 
{
	@Autowired
	SessionFactory sf;
	
	@Transactional
	public void saveAlien(Alien a)
	{
		
		Session session = sf.getCurrentSession();
		session.save(a);
	}
}
