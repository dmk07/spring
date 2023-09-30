package com.hcl.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("addr")
public class Student {

	
	@Autowired()
	private Address addr;
	
	private String sname="Dipak";
	private String sclass="CS";
	
	
	
	
	public Student() {
		System.out.print("0 par cons-studnet");
	}




	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sclass=" + sclass + ", addr=" + addr + "]";
	}

}
