package com.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;


import com.test.utility.DbUtility;
import com.test.dao.EmployeeDAO;
import com.test.model.EmployeeTest;

public class EmployeeTestDAOImpl implements EmployeeDAO{

	private static final String INSERT_EMPLOYEE_QUERY="insert into hr.employeetest values (?,?,?,?,?)";
	@Override
	public boolean insertEmployee(EmployeeTest employee) {
		// TODO Auto-generated method stub
		int rowsaffected=0;
		Connection connection=DbUtility.getMyConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(INSERT_EMPLOYEE_QUERY);
			
			
				
		
		statement.setString(1, employee.getFName());
		statement.setString(2, employee.getLastname());
		statement.setString(3, employee.getEmpid());
		statement.setString(4, employee.getDob());
		statement.setString(5, employee.getAddress());
		
		
		rowsaffected=statement.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rowsaffected==0)
			return false;
		else 
			return true;
		
	
	}

}
