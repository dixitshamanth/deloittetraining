package exceptionhandling;


class Customer{
	String customerName;
	int customerId;
	String customerAddress;
	int billamount;
	
	
	public Customer(String customerName, int customerId, String customerAddress, int billamount) throws NegativeBillAmountException {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerAddress = customerAddress;
		
		if(billamount>0) {
			this.billamount = billamount;
		}
		
		else
		{
			throw new NegativeBillAmountException("Bill can't be negative");
		}
	}

	public Customer() {
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}

	
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerAddress=" + customerAddress + ", billamount=" + billamount + "]";
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getBillamount() {
		return billamount;
	}

	public void setBillamount(int billamount) {
		this.billamount = billamount;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	
	
	
}

		



