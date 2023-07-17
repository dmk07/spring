package com.hcl.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.hcl.beans.WishMessage;

public class TestApp {

	public static void main(String[] args) {
	
		FileSystemResource file=new FileSystemResource("src/com/hcl/config/Config.xml");
	
		XmlBeanFactory bean=new XmlBeanFactory(file);
		
		Object obj=bean.getBean("wm");
		
		WishMessage wm=(WishMessage)obj;
		String msg=wm.Wish("Dipak");
		
		System.out.print(msg);
	
	}

}
