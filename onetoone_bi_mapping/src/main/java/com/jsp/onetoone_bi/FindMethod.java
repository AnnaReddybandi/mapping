package com.jsp.onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindMethod {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
          em.find(Person.class, 2);
	}

}

