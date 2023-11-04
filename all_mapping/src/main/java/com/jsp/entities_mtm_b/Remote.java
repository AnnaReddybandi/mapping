package com.jsp.entities_mtm_b;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Remote {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Rcolor;
	private String Rcompany;
	private int price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<ElectronicTv>tv;

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

	public String getRcolor() {
		return Rcolor;
	}

	public void setRcolor(String rcolor) {
		Rcolor = rcolor;
	}

	public String getRcompany() {
		return Rcompany;
	}

	public void setRcompany(String rcompany) {
		Rcompany = rcompany;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<ElectronicTv> getTv() {
		return tv;
	}

	public void setTv(List<ElectronicTv> tv) {
		this.tv = tv;
	}
	
	
}
