package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bDart")
public final class Flipkart {
	
	@Autowired()
	private  Courier courier;
	
/*	@Autowired
	public Flipkart(@Qualifier("dtdc") Courier courier) {
		this.courier=courier;
		System.out.println("Flipkart:: 1-param constructor");
	}
	
	@Autowired
	@Qualifier("fFlight")
	public  void   assign(Courier courier) {
		System.out.println("Flipkart.assign(-)");
		this.courier=courier;
	}
	
	@Autowired
	@Qualifier("bDart")
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		 this.courier=courier;
	} */
	
	
	
	//b,method
	public  String  shopping(String [] items, float[] prices) {
		float billAmt=0.0f;
		for(float p:prices)
			billAmt+=p;  // billAmt=billAmt+p
		//generate order id
		  int oid=new Random().nextInt(1000);
		  //use courier
		  String msg=courier.deliver(oid);
		  return  Arrays.toString(items)+" with prices"+Arrays.toString(prices)+" having billamt"+billAmt +" :::: "+ msg;
	}
	

}