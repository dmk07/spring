package com.hcl.bo;

public class CustomerBO {
	
	private String custName;
	private String custaddrs;
	private Float pamt;
	private Float rate;
	private Float time;
	private Float intrestAmount;
	
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
	public Float getIntrestAmount() {
		return intrestAmount;
	}
	public void setIntrestAmount(Float intrestAmount) {
		this.intrestAmount = intrestAmount;
	}
	@Override
	public String toString() {
		return "CustomerBO [custName=" + custName + ", custaddrs=" + custaddrs + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + ", intrestAmount=" + intrestAmount + ", getCustName()=" + getCustName()
				+ ", getCustaddrs()=" + getCustaddrs() + ", getPamt()=" + getPamt() + ", getRate()=" + getRate()
				+ ", getTime()=" + getTime() + ", getIntrestAmount()=" + getIntrestAmount() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
