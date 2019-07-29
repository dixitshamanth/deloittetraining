package com.test.client;

import com.test.dao.EmployeeDAO;
import com.test.dao.impl.EmployeeTestDAOImpl;
import com.test.model.EmployeeTest;
import java.sql.Date;

public class EmployeeClient {
	public static void main(String[] args) {
		
	
	
	EmployeeDAO e1=new EmployeeTestDAOImpl();
	
	EmployeeTest employee=new EmployeeTest("Varun","Dhawan","20-03-1998","Mysore");
	boolean a=e1.insertEmployee(employee);
	System.out.println(a);

	}
	
}
