package com.telusko.myhibo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Primary


public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Laptop l1 = new Laptop();
    	l1.setLid(501);
    	l1.setBrand("Dell");
    	
    	Laptop l2 = new Laptop();
    	l2.setLid(502);
    	l2.setBrand("Asus");
    	
        Alien a1 = new Alien();
        a1.setAid(103);
        a1.setAname("Kamil");
//        a1.getLaps().add(l1);
//        a1.getLaps().add(l2);
        
        l1.setAlien(a1);
        l2.setAlien(a1);
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);   
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession(); 
       
       session.beginTransaction();
       
       
       session.save(l1);
       session.save(l2);
       session.save(a1);
  
        session.getTransaction().commit();
        
        System.out.println(a1);
        
    }
}
// the More Classes you write, Your Class will increase