package com.hcl.dao;

import com.hcl.bo.CustomerBO;

public interface ICustomerDAO {
	
	public int insert(CustomerBO bo) throws Exception;

}
