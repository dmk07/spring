package com.hcl.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String homeNumber;
	private String locationMark;
	private String city;
	
	
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public String getLocationMark() {
		return locationMark;
	}
	public void setLocationMark(String locationMark) {
		this.locationMark = locationMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
