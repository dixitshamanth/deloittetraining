import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class CollectionDemo {

	public static void main(String[] args) {
		List<customer.Customer> list=new ArrayList<customer.Customer>();
		customer.Customer customer1=new customer.Customer("Divya",1,"Mysore",5400);
		list.add(customer1);
		list.add(new customer.Customer("Varun",2,"BLR",5555));
		list.add(new customer.Customer("Jay",3,"Delhi",6555));
		list.add(new customer.Customer("Mahesh",4,"Mumbai",3555));
		
		System.out.println("Enter option 1.Sort on Name 2.Sort on BillAmount 3.Sort on Address\n");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		if(option==1)
		Collections.sort(list);
		if(option==2)
		Collections.sort(list, new BillAmountComparator());
		if(option==3)
			Collections.sort(list, new AddressComparator());
		if(option==4)
		{
			Collections.sort(list,new Comparator<customer.Customer>() //anonymous inner class
					{
						public int compare(customer.Customer o1, customer.Customer o2)
						{
							if(o1.getCustomerId()>o2.getCustomerId())
								return -1;
							else
								return 0;
						}
					});
		}
		System.out.println(list);
		

		Iterator<customer.Customer> iterator= list.iterator();
		
		System.out.println("customer whose bill is >5000");
		while(iterator.hasNext()) {
			customer.Customer c1=iterator.next();
			if(c1.getBillamount()>5000)
				System.out.println(c1);
		
				
		}
		
		
	}
}
