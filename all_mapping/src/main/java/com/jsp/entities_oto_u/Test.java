package com.jsp.entities_oto_u;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		female f=new female();
		f.setName("haritha");
		f.setGender("female");
		f.setAge(22);
		f.setEmail("haritha@gmail.com");
		
		male m= new male();
		m.setName("kittu");
		m.setGender("male");
		m.setAge(23);
		m.setEmail("bandiannareddy@gmail.com");
		m.setFemales(f);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(f);
		em.persist(m);
		et.commit();
	}
}
