package customer;

public class CustomerApp {
 

		public static void main(String[] args) {
			Customer customer1=new Customer("Varun", 23,"Mysore",2000);
			Customer customer2=new Customer("Bhuvan", 45,"Bangalore",2300);
			Customer customer3=new Customer("Sanjana",44,"Bangalore",4400);
			System.out.println(customer1);
			System.out.println(customer2);
			System.out.println(customer3);
			
			customer3.setBillamount(3300);
			
			System.out.println(customer3.getBillamount());
		}
}
		
					
