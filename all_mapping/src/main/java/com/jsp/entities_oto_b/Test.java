package com.jsp.entities_oto_b;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
   public static void main(String[] args) {
	
	   Man m= new Man();
	   m.setName("kittu");
	   m.setGender("male");
	   m.setEmail("annareddy@gmail.com");
	   m.setWife("haritha");
	   
	   Women w= new Women();
	   w.setName("haritha");
	   w.setGender("female");
	   w.setEmail("haritha");
	   w.setHusbend("kittu");
	   
	   
	   w.setMan(m);
	   m.setWomen(w);
	   
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
	  EntityManager em=emf.createEntityManager();
	  EntityTransaction et=em.getTransaction();
	  et.begin();
	  
	  em.persist(w);
	  em.persist(m);
	  et.commit();
}
}
