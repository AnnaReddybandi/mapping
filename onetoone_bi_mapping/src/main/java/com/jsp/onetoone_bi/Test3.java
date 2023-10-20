package com.jsp.onetoone_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test3 {

	public static void main(String[] args) {
		String sql = "select p from Person p where p.name=:abc and p.age=:xyz";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(sql);

		query.setParameter("abc", "madhu");
		query.setParameter("xyz", 24 );

		List<Person> list = query.getResultList();

		//System.out.println(list);
		if (list != null) {
			System.out.println("------");
			for (Person o : list) {
				System.out.println(o);
			}
		} 
	}

}
