package com.hcl.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	
	private String custName;
	private String custaddrs;
	private Float pamt;
	private Float rate;
	private Float time;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustaddrs() {
		return custaddrs;
	}
	public void setCustaddrs(String custaddrs) {
		this.custaddrs = custaddrs;
	}
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "CustomerDTO [custName=" + custName + ", custaddrs=" + custaddrs + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
	
	
	

}
