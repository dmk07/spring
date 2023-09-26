package com.hcl.beans;

public class Robot {

	private String id;
	private String name;
	private String lab;
	private float price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", lab=" + lab + ", price=" + price + "]";
	}
	
	
	
	
	
}
