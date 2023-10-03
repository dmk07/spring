package com.hcl.vo;

import com.hcl.bo.Address;

public class StudentVO {
	
	private String studName;
	private Address addr;
	private String edu;
	private String roomNo;
	private String checkIn;
	private String checkOut;
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "StudentVO [studName=" + studName + ", addr=" + addr + ", edu=" + edu + ", roomNo=" + roomNo
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}
	
	

}
