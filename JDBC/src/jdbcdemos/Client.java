package jdbcdemos;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import jdbcdemos.CustomerJDBCops;
 class Client {
public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
	System.out.println("Enter choice 1.Show all records 2.Insert a record 3.Insert by PS 4.Delete by id");
	Scanner sc=new Scanner(System.in);
	int option=sc.nextInt();
	if(option==1)
	CustomerJDBCops.selectAllRecords();
	if(option==2)
	CustomerJDBCops.insertRecords();
	if(option==3)
		CustomerJDBCops.insertRecordsPS();
	if(option==4)
		CustomerJDBCops.DeleteRecordPS();
	
	sc.close();
}
}
