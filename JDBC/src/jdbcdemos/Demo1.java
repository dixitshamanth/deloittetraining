package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	System.out.println("Enter choice 1.Show all records 2.Insert a record");
	Scanner sc=new Scanner(System.in);
	int option=sc.nextInt();
	if(option==1)
	selectAllRecords();
	if(option==2)
	insertRecord();
}

private static void selectAllRecords() throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver Loaded");
	
	
	Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
	System.out.println("Connected");
	
	Statement statement=connection.createStatement();
	
	ResultSet res=statement.executeQuery("select * from HR.stu");
	
	while(res.next())
	{
		System.out.println(res.getString(1)+"");
		System.out.println(res.getString(2));
	}
}

private static void insertRecord() throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver Loaded");
	
	
	Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
	System.out.println("Connected");
	
	Statement statement=connection.createStatement();
	
	int rowsaffected=statement.executeUpdate("insert into HR.stu values (20,'Harish')");
	
	System.out.println(rowsaffected + " affected");
}
}
