package com.hcl.vo;

public class CustomerVO {
	private String custName;
	private String custaddrs;
	private String pamt;
	private String rate;
	private String time;
	
	
	@Override
	public String toString() {
		return "CustomerVO [custName=" + custName + ", custaddrs=" + custaddrs + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
	
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
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
}
