package com.jsp.onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
   Person p=new Person();
     p.setName("krishna");
     p.setGender("male");
     p.setAge(24);
     p.setLoc("kadapa");
    
     
    Identity i=new Identity();
    i.setName("adhar");
    i.setPhoneNo("634876");
    i.setEmail("madhu@gmail.com");
    
    i.setPerson(p);
    p.setIdentity(i);
    
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
    EntityManager em =emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    
    et.begin();
    
    em.persist(p);
    em.persist(i);
    et.commit();
	}

}
