package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"beans.xml","second.xml"});
		
		Customer customer=context.getBean(Customer.class);
		
		Address address=context.getBean(Address.class);
		
		customer.setCustomerId(12);
		customer.setCustomerName("kapoor");
		customer.setCustomerAddress("Mumbai");
		customer.setBillAmount(42323);
		
		address.setaId(12);
		address.setCity("Pune");
		address.setState("maha");
		//customer.setAddress(address);
		System.out.println(customer);
		
		context.registerShutdownHook();
	}
}
