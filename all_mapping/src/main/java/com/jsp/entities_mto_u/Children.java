package com.jsp.entities_mto_u;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Children {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String gender;
private int age;
  @ManyToOne
	private parent parents;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public parent getParents() {
	return parents;
}
public void setParents(parent parents) {
	this.parents = parents;
}
  
  
}
