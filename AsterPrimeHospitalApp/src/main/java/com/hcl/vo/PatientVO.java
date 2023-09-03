package com.hcl.vo;

public class PatientVO {
	
	private String patientName;
	private String patientAddr;
	private String patientMobile;
	private String patientDays;
	private String patientBillPerDay;
	private String patientTotalBill;
	public String getPatientTotalBill() {
		return patientTotalBill;
	}
	public void setPatientTotalBill(String patientTotalBill) {
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
	public String getPatientMobile() {
		return patientMobile;
	}
	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}
	public String getPatientDays() {
		return patientDays;
	}
	public void setPatientDays(String patientDays) {
		this.patientDays = patientDays;
	}
	public String getPatientBillPerDay() {
		return patientBillPerDay;
	}
	public void setPatientBillPerDay(String patientBillPerDay) {
		this.patientBillPerDay = patientBillPerDay;
	}
	@Override
	public String toString() {
		return "PatientVO [patientName=" + patientName + ", patientAddr=" + patientAddr + ", patientMobile="
				+ patientMobile + ", patientDays=" + patientDays + ", patientBillPerDay=" + patientBillPerDay + "]";
	}
	

}
