package com.telusko.myhibo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

// Model , Data class, 


// E.F Codd

// E-R -> Entity 

// Table and Entity?

// Class -> Entity (HQL) (JPQL)  -> Table (SQL)
// Alien -> alien_data -> alien_data


// Persistent and transient

@Entity
public class Alien 		// Business Model		// Need to have all the data
{
	@Id
	private int aid;
	private String aname;
	
	@OneToMany(mappedBy="alien")
	private Collection<Laptop> laps = new ArrayList<Laptop>();

	public Collection<Laptop> getLaps() {
		return laps;
	}
	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
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
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", lap=" + laps + "]";
	}
	
	
	
}
