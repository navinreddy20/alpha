package com.telusko.myhibo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Primary


public class App 
{
    public static void main( String[] args )
    {

        Alien a1 = new Alien();
        a1.setAid(5);
        a1.setAname("Pranay");
        a1.setTech("Oracle");

        
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
       EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
       a1 = em.find(Alien.class, 2);
       
       em.getTransaction().commit();
       System.out.println(a1);
        
    }
}
// the More Classes you write, Your Class will increase