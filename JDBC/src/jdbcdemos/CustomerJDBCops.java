package jdbcdemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerJDBCops {
	public static void selectAllRecords() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		
		
		Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		System.out.println("Connected");
		
		Statement statement=connection.createStatement();
		
		ResultSet res=statement.executeQuery("select * from HR.customer");
		
		while(res.next())
		{
			System.out.println(res.getString(1)+" \t");
			System.out.println(res.getString(2)+" \t");
			System.out.println(res.getString(3)+" \t");
			System.out.println(res.getString(4)+" \t");
		}
	}
	
	public static void insertRecords() throws ClassNotFoundException, SQLException, IOException {
		
		Connection connection=DBUtility.getMyConnection();
		Statement statement=connection.createStatement();
		
		System.out.println("Please enter four field values for the customer table");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int id=Integer.parseInt(br.readLine());
		String name=br.readLine();
		String address=br.readLine();
		int amount=Integer.parseInt(br.readLine());
		
		int rowsaffected=statement.executeUpdate("insert into HR.customer values("+id+ ", '"+name+"','"+address+ "',"+amount+")");
		
		System.out.println(rowsaffected + " rows affected");
	}
	
public static void insertRecordsPS() throws ClassNotFoundException, SQLException, IOException {
	System.out.println("Please enter four field values for the customer table");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int id=Integer.parseInt(br.readLine());
	String name=br.readLine();
	String address=br.readLine();
	int amount=Integer.parseInt(br.readLine());
		
		Connection connection=DBUtility.getMyConnection();
		PreparedStatement statement=connection.prepareStatement("insert into HR.customer values (?,?,?,?)");
		statement.setInt(1, id);
		statement.setString(2, name);
		statement.setString(3, address);
		statement.setInt(4, amount);
		
		
		int rowsaffected=statement.executeUpdate();
		
		System.out.println(rowsaffected + " rows affected");
	}

public static void DeleteRecordPS() throws ClassNotFoundException, SQLException, IOException {
	System.out.println("Please enter the id to delete");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int id=Integer.parseInt(br.readLine());

		
		Connection connection=DBUtility.getMyConnection();
		PreparedStatement statement=connection.prepareStatement("delete from HR.customer where customerId=?");
		statement.setInt(1, id);

		int rowsaffected=statement.executeUpdate();
		
		System.out.println(rowsaffected + " rows deleted");
	}
}

