package com.jsp.entities_mto_b;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentsInClass {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int strength;
	private String CR;
	private String LR;
	
	@ManyToOne
	private  ClassRoom classroom;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getCR() {
		return CR;
	}

	public void setCR(String cR) {
		CR = cR;
	}

	public String getLR() {
		return LR;
	}

	public void setLR(String lR) {
		LR = lR;
	}

	public ClassRoom getClassroom() {
		return classroom;
	}

	public void setClassroom(ClassRoom classroom) {
		this.classroom = classroom;
	}
	
	
}
