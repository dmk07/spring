package com.hcl.service;

import com.hcl.bo.CustomerBO;
import com.hcl.dao.ICustomerDAO;
import com.hcl.dto.CustomerDTO;

public final class CustomerServiceImpl implements ICustomerService {

	
	private ICustomerDAO dao;
	
	
	
	public CustomerServiceImpl(ICustomerDAO dao) {
		super();
		this.dao = dao;
	}



	@Override
	public String calculateInterestAmount(CustomerDTO dto) throws Exception {
	
		float intrestamount=(dto.getPamt()*dto.getTime())/100.0f;
		
		CustomerBO bo=new CustomerBO();
		
		bo.setCustName(dto.getCustName());
		bo.setCustaddrs(dto.getCustaddrs());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrestAmount(intrestamount);

		int count=dao.insert(bo);
		
		
		return count==1?"Customer registred"+intrestamount:"customer failed";
	}

}
