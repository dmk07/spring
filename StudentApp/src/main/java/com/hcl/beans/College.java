package com.hcl.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stud")
@Scope("prototype")
public class College {
	
	
	@Autowired()
	private Student stud;
	
	private String college="mgm";
	
	
	public College() {
		super();
		System.out.print("0 par cons");
	}
	


	@Override
	public String toString() {
		return "College [stud=" + stud + ", college=" + college + "]";
	}

	
	
	

}
