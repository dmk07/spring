package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class TranditionalDependencyLookupTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
          System.out.println("TranditionalDependencyLookupTest.main()  :: 1st IOC container creation ");
		//get target spring bean class object
		Cricketer cricketer=ctx.getBean("cktr",Cricketer.class);
		//invoke method b.methods
		cricketer.fielding();
		cricketer.bowling();
		cricketer.batting();
		
		//close container
		ctx.close();
	}

}
