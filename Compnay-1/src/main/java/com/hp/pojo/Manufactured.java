package com.hp.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manufactured {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int manufacturedId;
	private String manufacutedCountry;
	
	public int getManufacturedId() {
		return manufacturedId;
	}
	public void setManufacturedId(int manufacturedId) {
		this.manufacturedId = manufacturedId;
	}
	public String getManufacutedCountry() {
		return manufacutedCountry;
	}
	public void setManufacutedCountry(String manufacutedCountry) {
		this.manufacutedCountry = manufacutedCountry;
	}
	
	public Manufactured(int manufacturedId, String manufacutedCountry) {
		super();
		this.manufacturedId = manufacturedId;
		this.manufacutedCountry = manufacutedCountry;
	}
	public Manufactured() {
		super();
		// TODO Auto-generated constructor stub
	}

}
