package com.hcl.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("addr")
public class Employee {
	
	private int eid=101;
	private String ename="Dipak";
	
	@Autowired()
	private Address addr;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", addr=" + addr + "]";
	}
	
	
	
	
	

}
