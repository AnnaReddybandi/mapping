package com.jsp.entities_mto_b;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ClassRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int classname;
	private String Steacher;
	
	@OneToMany
	private List<StudentsInClass> student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassname() {
		return classname;
	}

	public void setClassname(int classname) {
		this.classname = classname;
	}

	public String getSteacher() {
		return Steacher;
	}

	public void setSteacher(String steacher) {
		Steacher = steacher;
	}

	public List<StudentsInClass> getStudent() {
		return student;
	}

	public void setStudent(List<StudentsInClass> student) {
		this.student = student;
	}

	
	
}
