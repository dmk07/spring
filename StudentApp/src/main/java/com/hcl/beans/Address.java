package com.hcl.beans;

import org.springframework.stereotype.Component;

@Component("addr")
public class Address {
	
	private String homeNumber="23,Sector26";
	private String locationMark="Circle";
	private String city="Pune";
	@Override
	public String toString() {
		return "Address [homeNumber=" + homeNumber + ", locationMark=" + locationMark + ", city=" + city + "]";
	}
	
	

}
