package com.hcl.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("addr")
public class Student {

	
	@Autowired
	@Qualifier("addr")
	private Address addr;
	
	private String sname;
	private String sclass;
	

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sclass=" + sclass + ", addr=" + addr + "]";
	}

}
