package com.jsp.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.Path;

import com.jsp.entities.Pan;
import com.jsp.entities.Person;

public class Test {
  
	public static void main(String[] args) {
		  Pan pan=new Pan();
		  pan.setAddress("Galiveedu");
		  pan.setPanNumber("KPRFE87349");
		  
		  Person person =new Person();
		  person.setName("haritha");
		  person.setEmail("haritha@123");
		  person.setPhone(43896826);
		  
		  person.setPan(pan);
		  
		  EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
		  EntityManager  em=emf.createEntityManager();
		  EntityTransaction et=em.getTransaction();
		  
		  et.begin();
		  em.persist(person);
		  em.persist(pan);
		  et.commit();
	}
}
