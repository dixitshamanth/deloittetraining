package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;

public class Client {

	public static void main(String[] args) {
		
		
		Configuration configuration=new Configuration().configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();
		Customer customer=new Customer(1222,"Rajesh","AAA",12321);
		session.save(customer);
		Customer customer1=(Customer)session.load(Customer.class, 1222);
		customer1.setCustomerName("BBB");
		transaction.commit();
		session.close();
		factory.close();
		
	}
}
