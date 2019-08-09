import java.util.Comparator;

import customer.Customer;

public class AddressComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getCustomerAddress().compareTo(o2.getCustomerAddress())<0)
			return -1;
		else
		return 0;
	}

}
