package com.hcl.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {


	private String sname="Dipak";
	private String sclass="CS";
	
	@Autowired
	private Address addr;
	
//	public Student() {
//		System.out.print("0 par cons-studnet");
//	}

	@Override
	public String toString() {
		return "Student [addr=" + addr + ", sname=" + sname + ", sclass=" + sclass + "]";
	}


	


	

}
