package com.jsp.entities_mtm_b;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ElectronicTv {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private  String name;
	private  String color;
	private String power;
	private int Tvprice;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Remote>remote;
	
	public int getId() {
		return id;
	}
	public List<Remote> getRemote() {
		return remote;
	}
	public void setRemote(List<Remote> remote) {
		this.remote = remote;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getTvprice() {
		return Tvprice;
	}
	public void setTvprice(int tvprice) {
		Tvprice = tvprice;
	}
	
	
}
