package com.jsp.entities_mto_u;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {

		parent p = new parent();
		p.setName("Ramana");
		p.setGender("male");
		p.setAge(23);

		Children ch = new Children();
		ch.setName("soumika");
		ch.setAge(11);
		ch.setGender("female");
		ch.setParents(p);
		
		Children ch1 = new Children();
		ch1.setName("Lohith");
		ch1.setAge(2);
		ch1.setGender("male");
		ch1.setParents(p);
		
		Children ch2 = new Children();
		ch2.setName("whitu");
		ch2.setAge(6);
		ch2.setGender("female");
		ch2.setParents(p);
		
		Children ch3 = new Children();
		ch3.setName("vedha");
		ch3.setAge(15);
		ch3.setGender("male");
		ch3.setParents(p);

		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		em.persist(p);
		em.persist(ch);
		em.persist(ch1);
		em.persist(ch2);
		em.persist(ch3);
		et.commit();
	}
}
