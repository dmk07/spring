package com.hcl.service;

import com.hcl.dto.CustomerDTO;

public interface ICustomerService {
	
	public String calculateInterestAmount(CustomerDTO dto) throws Exception;

}
