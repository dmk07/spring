package com.hcl.test;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.hcl.beans.WishMessage;

public class TestApp {

	public static void main(String[] args) throws ClassNotFoundException, ReflectiveOperationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		FileSystemResource file=new FileSystemResource("src/com/hcl/config/Config1.xml");
		XmlBeanFactory bean=new XmlBeanFactory(file);
	
//		Object obj = bean.getBean("wmg");
//		WishMessage wm=(WishMessage)obj;

		WishMessage wmg=bean.getBean("wm", WishMessage.class);
		
		String msg=wmg.Wish("Dipak");
		
		System.out.print(msg);
	
	}

}
