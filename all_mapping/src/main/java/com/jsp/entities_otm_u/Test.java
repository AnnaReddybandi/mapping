package com.jsp.entities_otm_u;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
 public static void main(String[] args) {
	List<Books> list=new ArrayList<Books>();
	 Books b=new Books();
	 b.setBname("surveying");
	 b.setPages(2000);
	 b.setPrice(300);
	 
	 Books b1= new Books();
	 b.setBname("Fluid mechanics");
	 b.setPages(508);
	 b.setPrice(850);
	 
	 Books b2= new Books();
	 b.setBname("soil mechanics");
	 b.setPages(600);
	 b.setPrice(1550);
	 
	 Books b3= new Books();
	 b.setBname("Environmental Engieering");
	 b.setPages(650);
	 b.setPrice(400);
	 
//	 list.add(b);
//	 list.add(b1);
//	 list.add(b2);
//	 list.add(b3);
	 
	 Bag bag= new Bag();
	   bag.setName("mohan");
	   bag.setColor("white");
	   bag.setNoOfBooks(300);
	   bag.setBooks(list);
	   
	   EntityManagerFactory emf= Persistence.createEntityManagerFactory("simha");
	   EntityManager em= emf.createEntityManager();
	   EntityTransaction et=em.getTransaction();
	   
	   et.begin();
	   em.persist(bag);
	   em.persist(b);
	   em.persist(b1);
	   em.persist(b2);
	   em.persist(b3);
	   et.commit();
}
}
