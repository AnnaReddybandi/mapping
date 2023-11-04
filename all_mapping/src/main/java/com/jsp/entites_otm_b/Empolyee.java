package com.jsp.entites_otm_b;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Empolyee {

	@Id
	@GenericGenerator(name = "abc", strategy = "com.jsp.entites_otm_b.CustomId")
	@GeneratedValue(generator = "abc")
	private int id;
	private String name;
	private  Address address;
	private int sal;

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

	

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Empolyee() {

	}

	public Empolyee( String name, String address, int sal) {
		super();

		this.name = name;
		address = address;
		this.sal = sal;
	}

	
}
