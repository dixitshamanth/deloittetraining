import java.io.*;
import java.util.Properties;
public class PropertiesDemo{
	public static void main(String[] args) throws IOException {
		Properties properties=new Properties();
		FileReader reader=new FileReader("C:\\Deloitte\\Projects\\Demo1\\mydb.properties");
		
		properties.load(reader);
		
		System.out.println(properties.get("username"));
		System.out.println(properties.get("password"));
		System.out.println(properties.get("name"));
		System.out.println(properties.get("empid"));
		System.out.println(properties.get("url"));
	}

}
