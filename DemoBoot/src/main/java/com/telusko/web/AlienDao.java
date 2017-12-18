package com.telusko.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AlienDao 
{

	List<Alien> aliens = new ArrayList<>(Arrays.asList(new Alien(101,"Navin","Java"),new Alien(102,"Bhuvi",".Net")));
	
	public List<Alien> getAliens() {
	
		return aliens;
	}

	public Alien getAlien(int aid) {

			return aliens.get(0);
		
	}

	public void saveAlien(Alien alien) {
		
		aliens.add(alien);
		System.out.println(aliens);
	}
	
}
