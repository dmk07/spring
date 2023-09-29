package com.hcl.comp;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	
	@Override
	public String delivery(int oid) {
		
		
		return "Your product id"+oid+"is delivered by DTDC services";
	}

}
