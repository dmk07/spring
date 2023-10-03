package com.hcl.dto;

import com.hcl.bo.Address;

public class StudentDTO {
	
	private String studName;
	private Address addr;
	private String edu;
	private int roomNo;
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
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
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
		return "StudentDTO [studName=" + studName + ", addr=" + addr + ", edu=" + edu + ", roomNo=" + roomNo
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}
	
	
	

}
