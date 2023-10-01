package com.hcl.comp;

import org.springframework.stereotype.Component;

@Component("fedfx")
public class FedFx implements Courier {

	public FedFx() {
		System.out.print("fedfc con");
	}
	
	
	@Override
	public String delivery(int oid) {
		
		return "Your product id:"+ oid +"is delivered by FedFx services";
	}

	
	
	
	
	
}
