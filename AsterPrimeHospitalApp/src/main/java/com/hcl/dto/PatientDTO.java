package com.hcl.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {
	
	private String patientName;
	private String patientAddr;
	private Long patientMobile;
	private Integer patientDays;
	private Float patientBillPerDay;
	private Float patientTotalBill;
	public Float getPatientTotalBill() {
		return patientTotalBill;
	}
	public void setPatientTotalBill(Float patientTotalBill) {
		this.patientTotalBill = patientTotalBill;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddr() {
		return patientAddr;
	}
	public void setPatientAddr(String patientAddr) {
		this.patientAddr = patientAddr;
	}
	public Long getPatientMobile() {
		return patientMobile;
	}
	public void setPatientMobile(Long patientMobile) {
		this.patientMobile = patientMobile;
	}
	public Integer getPatientDays() {
		return patientDays;
	}
	public void setPatientDays(Integer patientDays) {
		this.patientDays = patientDays;
	}
	public Float getPatientBillPerDay() {
		return patientBillPerDay;
	}
	public void setPatientBillPerDay(Float patientBillPerDay) {
		this.patientBillPerDay = patientBillPerDay;
	}
	@Override
	public String toString() {
		return "PatientBO [patientName=" + patientName + ", patientAddr=" + patientAddr + ", patientMobile="
				+ patientMobile + ", patientDays=" + patientDays + ", patientBillPerDay=" + patientBillPerDay + "]";
	}
	
	
	

}
