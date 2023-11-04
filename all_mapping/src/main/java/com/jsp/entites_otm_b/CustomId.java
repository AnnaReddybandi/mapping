package com.jsp.entites_otm_b;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomId implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
//		
//		
//		Random randam =new Random();
//		
//		return "emp"+ randam.nextInt(9)+randam.nextInt(9)+randam.nextInt(9);
		
	}

	
	

