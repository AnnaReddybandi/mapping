package com.jsp.entities_mto_b;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		
        List<StudentsInClass> list=new ArrayList<StudentsInClass>();
        
		ClassRoom cr=new ClassRoom();
		cr.setClassname(7);
		cr.setSteacher("ramya");
      
	
		StudentsInClass st=new StudentsInClass();
		st.setCR("ramu");
        st.setLR("rani");
        st.setStrength(30);
        st.setClassroom(cr);
        
        StudentsInClass st1=new StudentsInClass();
		st1.setCR("rajesh");
        st1.setLR("ramyasree");
        st1.setStrength(16);
        st1.setClassroom(cr);
        
        StudentsInClass st2=new StudentsInClass();
		st2.setCR("ramu");
        st2.setLR("rani");
        st2.setStrength(30);
        st2.setClassroom(cr);
        
        StudentsInClass st3=new StudentsInClass();
		st3.setCR("ramu");
        st3.setLR("rani");
        st3.setStrength(30);
        st3.setClassroom(cr);
        
        list.add(st);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        
        cr.setStudent(list);
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        
        et.begin();
        em.persist(cr);
        em.persist(st);
        em.persist(st1);
        em.persist(st2);
        em.persist(st3);
        et.commit();
	}
}
