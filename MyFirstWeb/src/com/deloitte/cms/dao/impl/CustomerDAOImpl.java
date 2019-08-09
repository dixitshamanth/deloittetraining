package com.deloitte.cms.dao.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;


public class CustomerDAOImpl implements CustomerDAO {
	private static final String GET_ALL_CUSTOMER_QUERY="select * from hr.customer";
	@Override
	public List<Customer> getAllCustomers() {
		
		Connection connection= DbUtility.getMyConnection();
		
		List<Customer> allCustomers=new ArrayList<Customer>();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(GET_ALL_CUSTOMER_QUERY);
		
		
		ResultSet rs = statement.executeQuery();
		
		while(rs.next()) {
			Customer customer=new Customer();
		customer.setCustomerId(rs.getInt(1));
		customer.setCustomerName(rs.getString(2));
		customer.setCustomerAddress(rs.getString(3));
		customer.setBillAmount(rs.getInt(4));
		allCustomers.add(customer);
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allCustomers;
		
	}
	private static final String INSERT_CUSTOMER_QUERY="insert into hr.customer values (?,?,?,?)";
	@Override
	public boolean insertCustomer(Customer customer) {
		
			int rowsaffected=0;
			Connection connection=DbUtility.getMyConnection();
			PreparedStatement statement;
			try {
				statement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
			
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setString(3, customer.getCustomerAddress());
			statement.setInt(4, customer.getBillAmount());
			
			
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
	private static final String UPDATE_CUSTOMER_QUERY="update hr.customer set customerName=?, customerAddress=? ,billAmount=? where customerId=? ";
	@Override
	public boolean updateCustomer(Customer customer) {

		int rowsaffected=0;
		Connection connection=DbUtility.getMyConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
		
		statement.setInt(4, customer.getCustomerId());
		statement.setString(1, customer.getCustomerName());
		statement.setString(2, customer.getCustomerAddress());
		statement.setInt(3, customer.getBillAmount());
		
		
		
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
	private static final String DELETE_CUSTOMER_QUERY="delete from HR.customer where customerId=?";
	@Override
	public boolean deleteCustomer(int customerID) {
		int rowsaffected=0;
		Connection connection= DbUtility.getMyConnection();
		boolean isUserExists=false;
		
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(DELETE_CUSTOMER_QUERY);
		
		statement.setInt(1, customerID);
		
		rowsaffected = statement.executeUpdate();
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rowsaffected==0) {
			return false;
		}
		else
			return true;
			
	}
				


	@Override
	public Customer searchCustomerById(int customerId) {
		
		Connection connection= DbUtility.getMyConnection();
		boolean isUserExists=false;
		Customer customer=new Customer();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(SELECT_CUSTOMER_QUERY);
		
		statement.setInt(1, customerId);
		
		ResultSet rs = statement.executeQuery();
		rs.next();
		customer.setCustomerId(rs.getInt(1));
		customer.setCustomerName(rs.getString(2));
		customer.setCustomerAddress(rs.getString(3));
		customer.setBillAmount(rs.getInt(4));
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;

		
	}
	private static final String SELECT_CUSTOMER_QUERY="select * from HR.customer where customerId=?";
	@Override
	public boolean isCustomerExists(int customerId) {
		Connection connection= DbUtility.getMyConnection();
		boolean isUserExists=false;
		
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(SELECT_CUSTOMER_QUERY);
		
		statement.setInt(1, customerId);
		
		ResultSet rs = statement.executeQuery();
		
		if(rs.next()) {
			isUserExists=true;
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUserExists;
	}

}
