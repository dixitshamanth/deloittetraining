import java.util.Comparator;

import customer.Customer;

public class BillAmountComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getBillamount()<o2.getBillamount())
		return -1;
		else
			return 0;
	}

}
