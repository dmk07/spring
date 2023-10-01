package com.hcl.comp;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	
	public DTDC() {
		System.out.print("DTDC con");
	}

	@Override
	public String delivery(int oid) {
		
		
		return "Your product id"+ oid +"is delivered by DTDC services";
	}

}
