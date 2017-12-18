package com.telusko.web;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien 
{
	@Id
	private int aid;
	private String aname;
	private String tech;
	
	public Alien() {
		// TODO Auto-generated constructor stub
	}
	
	public Alien(int id, String aname, String tech) {
		super();
		this.aid = id;
		this.aname = aname;
		this.tech = tech;
	}
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	

}
