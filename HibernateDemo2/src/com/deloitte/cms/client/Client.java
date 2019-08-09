package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.PremiumCustomer;

public class Client {

	public static void main(String[] args) {
		
		
		Configuration configuration=new Configuration().configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Customer customer=new Customer(1222,"Rajesh","AAA",12321);
		session.save(customer);
		PremiumCustomer customer1=new PremiumCustomer(1223,"PREM","BLR",1212);
		customer1.setRewardpoints(9877);
		session.save(customer1);
		transaction.commit();
		session.close();
		factory.close();
		
	}
}
