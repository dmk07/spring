package com.hcl.controller;

import com.hcl.dto.PatientDTO;
import com.hcl.service.PatientServiceI;
import com.hcl.vo.PatientVO;

public class Controller {
	
	private PatientServiceI service;

	public Controller(PatientServiceI service) {
		super();
		this.service = service;
	}
	
	public String processBillAmount(PatientVO vo) throws Exception
	{
		PatientDTO dto=new PatientDTO();
		
		dto.setPatientName(vo.getPatientName());
		dto.setPatientAddr(vo.getPatientAddr());
		dto.setPatientMobile(Long.parseLong(vo.getPatientMobile()));
		dto.setPatientDays(Integer.parseInt(vo.getPatientDays()));
		dto.setPatientBillPerDay(Float.parseFloat(vo.getPatientBillPerDay()));
		
		String result=service.totalBillAmount(dto);
		return result;
		
	}
	
	
	
	
	

}
