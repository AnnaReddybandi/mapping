package com.jsp.onetoone_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		String sql = "select p from Person p where p.name=?1 and p.age=?2";
		Query query = em.createQuery(sql);
		query.setParameter(1, "madhu");
		query.setParameter(2, 24);
		List list = query.getResultList();
		System.out.println(list);
		if (list != null) {
			System.out.println("------");
			for (Object o : list) {
				System.out.println(o);
			}
		} else {
			System.out.println("no data");
		}
	}

}
