package com.jsp.entites_otm_b;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompositeKeyForEmp {	
	public static void main(String[] args) {
		Address address=new Address();
		
		address.setVillagename("bommanahalli");
		address.setState("TN");
		address.setPin(565786);
		address.setDoorName("45344");
		
		Empolyee emp=new Empolyee("rajesh", "bommanahalli", 10000);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		   et.begin();
		   em.persist(emp);
		   et.begin();
	}
} 
