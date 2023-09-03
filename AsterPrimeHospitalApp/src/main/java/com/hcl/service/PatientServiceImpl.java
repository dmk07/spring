package com.hcl.service;

import com.hcl.bo.PatientBO;
import com.hcl.dao.PatientDAOI;
import com.hcl.dto.PatientDTO;

public class PatientServiceImpl implements PatientServiceI {

	private PatientDAOI dao;

	public PatientServiceImpl(PatientDAOI dao) {
		super();
		this.dao = dao;
	}


	@Override
	public String totalBillAmount(PatientDTO dto) throws Exception {
	
		float amount=dto.getPatientBillPerDay()+dto.getPatientDays()*3000;
		
		PatientBO bo=new PatientBO();
		
		bo.setPatientAddr(dto.getPatientName());
		bo.setPatientAddr(dto.getPatientAddr());
		bo.setPatientMobile(dto.getPatientMobile());
		bo.setPatientDays(dto.getPatientDays());
		bo.setPatientBillPerDay(dto.getPatientBillPerDay());
		bo.setPatientTotalBill(amount);
		
		int count=dao.insert(bo);
		
		
		return count==1?"Patient Total Bill:"+amount:"Unable to calculate total bill";
	}
	

}
