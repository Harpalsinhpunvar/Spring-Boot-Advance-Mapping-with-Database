package com.hp.pojo;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductUtilities{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String utilitiesName;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUtilitiesName() {
		return utilitiesName;
	}
	public void setUtilitiesName(String utilitiesName) {
		this.utilitiesName = utilitiesName;
	}
	public ProductUtilities(int id, String utilitiesName) {
		super();
		this.id = id;
		this.utilitiesName = utilitiesName;
	}
	public ProductUtilities() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductUtilities [id=" + id + ", utilitiesName=" + utilitiesName + "]";
	}
}