package com.test.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DbUtility {
public static Connection getMyConnection() {
	
	
	Connection connection=null;
	Properties property=new Properties();
	FileReader reader=null;
	try {
		reader=new FileReader("C:\\Deloitte\\Projects\\Demo1\\mydb.properties");
	} catch (FileNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	try {
		property.load(reader);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	String driver=property.getProperty("driver");
	String url=property.getProperty("url");
	String username=property.getProperty("username");
	String pwd=property.getProperty("pwd");
	
	
	try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		connection= DriverManager.getConnection(url,username,pwd);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
	
}
}



