package com.hcl.service;

import com.hcl.dto.PatientDTO;

public interface PatientServiceI {
	
	public String totalBillAmount(PatientDTO dto) throws Exception;
}
