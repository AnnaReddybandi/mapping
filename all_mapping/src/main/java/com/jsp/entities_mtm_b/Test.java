package com.jsp.entities_mtm_b;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		List<ElectronicTv> tv = new ArrayList<ElectronicTv>();
		List<Remote> remote = new ArrayList<Remote>();

		ElectronicTv etv = new ElectronicTv();
		etv.setName("dish Tv");
		etv.setColor("black");
		etv.setPower("1000wts");
		etv.setTvprice(10000);
		etv.setRemote(remote);

		ElectronicTv etv1 = new ElectronicTv();
		etv1.setName("TATA");
		etv.setColor("white");
		etv.setPower("800wts");
		etv.setTvprice(30000);
		etv.setRemote(remote);

		ElectronicTv etv2 = new ElectronicTv();
		etv.setName("Sundirect");
		etv.setColor("black&white");
		etv.setPower("900wts");
		etv.setTvprice(40000);
		etv.setRemote(remote);

		Remote r = new Remote();
		r.setName("wiredlessremote");
		r.setPrice(3000);
		r.setRcolor("white");
		r.setRcompany("tata");
		r.setTv(tv);

		Remote r1 = new Remote();
		r1.setName("wiredremote");
		r1.setPrice(4000);
		r1.setRcolor("blue");
		r1.setRcompany("sky");
		r1.setTv(tv);

		Remote r2 = new Remote();
		r2.setName("wiredless");
		r2.setPrice(5000);
		r2.setRcolor("yellow");
		r2.setRcompany("Sundirect");
		r2.setTv(tv);

		tv.add(etv);
		tv.add(etv1);
		tv.add(etv2);

		remote.add(r);
		remote.add(r1);
		remote.add(r2);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(etv);
		em.persist(etv1);
		em.persist(etv2);
		em.persist(r);
		em.persist(r1);
		em.persist(r2);
		et.commit();
   
		
		
	/*
	 *  School-->teacher-->student-->classroom,subject,principal
	 *  
	 *  class school{
	 *  
	 *  sid;
	 *  name;
	 *  address
	 *  @onetomany
	 *  <teacher>
	 * 
	 * @onetomany
	 *  list<classroom>
	 *  
	 *  @onetoone 
	 *  principal
	 *  }
	 *  ----------------------------
	 *  class teacher{
	 *  id,name,exp
	 *  @onetone
	 *  subject subject
	 *  @onetomany
	 *  list<student>
	 *  
	 *  @manytoone
	 *  principal principal
	 *  -----------------
	 *  class subject{
	 *  id,name,duration
	 *  
	 *  @onetone --bi
	 *  teacher teacher
	 *  ---------------------
	 *  
	 *  
	 *  class Student{
	 *  
	 *  id,name,address,gender
	 *  
	 *  @onetomany
	 *  list<subject>
	 *  --------------------
	 *  class classroom{
	 *  id,capacity,
	 *  
	 *  @onetomany
	 *  list<student>
	 *  
	 *  ---------------
	 *  class principal{
	 *  id,name,age,gender,
	 *  
	 *  @onetomany
	 *  list<teacher>
	 *  
	 *  
	 */
		
		
		
		
		
	}

}
