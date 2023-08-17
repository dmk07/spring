package com.hcl.controller;

import com.hcl.dto.CustomerDTO;
import com.hcl.service.ICustomerService;
import com.hcl.vo.CustomerVO;



public final class MainController {

	private ICustomerService service;

	public MainController(ICustomerService service) {
			super();
			this.service = service;
	}
	
	public String processCustomer(CustomerVO vo) throws Exception
	{
		 CustomerDTO dto=new CustomerDTO();
		 dto.setCustName(vo.getCustName());
		 dto.setCustaddrs(vo.getCustaddrs());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		
		String result=service.calculateInterestAmount(dto);
		
		return result;
		
	}
	
	
}
