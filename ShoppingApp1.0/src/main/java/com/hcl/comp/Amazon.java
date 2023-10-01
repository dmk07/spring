package com.hcl.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("amzn")
@Scope("prototype")
public class Amazon implements Shopping {

	@Autowired
	@Qualifier("fedfx")
	private Courier courier;
	
	
	@Override
	public String buy(String[] items, float[] prices) {
		
			float billAmt=0.0f;
			for(float p:prices)
				billAmt+=p;  // billAmt=billAmt+p
			//generate order id
			  int oid=new Random().nextInt(1000);
			  //use courier
			  String msg=courier.delivery(oid);
			  return  Arrays.toString(items)+" with prices"+Arrays.toString(prices)+" having billamt"+billAmt +" :::: "+ msg;
		}
	}


