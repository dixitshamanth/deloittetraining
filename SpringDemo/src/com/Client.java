package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext(new String[] {"beans.xml","second.xml"});
		
		
		Customer customer=(Customer)context.getBean("c");
		
		System.out.println(customer);
		
		
		
	}
}
