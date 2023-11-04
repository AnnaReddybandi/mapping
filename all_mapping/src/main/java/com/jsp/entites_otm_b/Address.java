package com.jsp.entites_otm_b;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String Villagename;
	private int pin;
	private String state;
	private String doorName;
	public String getVillagename() {
		return Villagename;
	}
	public void setVillagename(String villagename) {
		Villagename = villagename;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDoorName() {
		return doorName;
	}
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}
	
	
}
