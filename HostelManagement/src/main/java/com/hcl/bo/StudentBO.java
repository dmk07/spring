package com.hcl.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("address")
public class StudentBO {

	private String studName;
	@Autowired
	@Qualifier("addr")
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
		return "StudentBO [studName=" + studName + ", addr=" + addr + ", edu=" + edu + ", roomNo=" + roomNo
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}
	
	
	
	
	

}
