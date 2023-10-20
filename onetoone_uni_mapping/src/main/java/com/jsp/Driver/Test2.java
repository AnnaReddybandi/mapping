package com.jsp.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.entities.Person;

//import com.jsp.onetoone_bi.Person;

public class Test2 {

	public static void main(String[] args) {
		
  String q="select p from Person p";
  EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
  EntityManager em=emf.createEntityManager();
  String sql="select p from Person p where p.name=?1";  // position paratmeter
   Query query=em.createQuery(sql);
   query.setParameter(1, "madhu");
   
  Person person=(Person)query.getSingleResult();
  System.out.println(person);

	}

}
