package com.test.model;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Random;
public class EmployeeTest implements Serializable{
	
	private String FName;
	private String Lastname;
	private String Empid;
	private String dob;
	private String Address;
	
	public EmployeeTest() {
		super();
	}
	public EmployeeTest(String fName, String Lastname, String dob, String address) {
		super();
		
		Random random=new Random();
		int r=random.nextInt(100);
		
		
		String f1=fName;
		String l1=Lastname;
		StringBuilder sb=new StringBuilder(); 
		sb.append(f1.substring(0, 2));
		sb.append(l1.substring(0, 2));
		sb.append(Integer.toString(r));
		
		FName = fName;
		this.Lastname = Lastname;
		Empid=sb.toString();
		this.dob = dob;
		Address = address;
	}
	

	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String Lastname) {
		Lastname = Lastname;
	}
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "EmployeeTest [FName=" + FName + ", Lastname=" + Lastname + ", Empid=" + Empid + ", dob=" + dob + ", Address="
				+ Address + "]";
	}
	
	

}
