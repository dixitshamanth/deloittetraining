package exceptionhandling;




public class CustomerApp {
 

		public static void main(String[] args) {
			Customer customer1;
			try {
				customer1 = new Customer("Varun", 23,"Mysore",-2000);
			} catch (NegativeBillAmountException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Customer customer2;
			try {
				customer2 = new Customer("Bhuvan", 45,"Bangalore",2300);
			} catch (NegativeBillAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Customer customer3;
			try {
				customer3 = new Customer("Sanjana",44,"Bangalore",4400);
			} catch (NegativeBillAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
		
					
