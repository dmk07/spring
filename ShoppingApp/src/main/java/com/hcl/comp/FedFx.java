package com.hcl.comp;

import org.springframework.stereotype.Component;

@Component("fedfx")
public class FedFx implements Courier {

	@Override
	public String delivery(int oid) {
		
		return "Your product id:"+ oid +"is delivered by FedFx services";
	}

	
	
	
	
	
}
