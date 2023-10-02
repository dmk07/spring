package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hcl.dto.CustomerDTO;
import com.hcl.service.ICustomerService;
import com.hcl.vo.CustomerVO;


@Controller("controller")
public final class MainController {

	@Autowired
	private ICustomerService service;

	
	
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
