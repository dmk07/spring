package com.hcl.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stud")
public class College {
	
	@Autowired()
	private Student stud;
	
	private String college="mgm";

	@Override
	public String toString() {
		return "College [stud=" + stud + ", college=" + college + "]";
	}

	
	
	

}
