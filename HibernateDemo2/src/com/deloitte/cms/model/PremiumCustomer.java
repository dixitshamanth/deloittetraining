package com.deloitte.cms.model;

public class PremiumCustomer extends Customer {

	int rewardpoints;

	public PremiumCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PremiumCustomer(int customerId, String customerName, String customerAddress, int billAmount) {
		super(customerId, customerName, customerAddress, billAmount);
		// TODO Auto-generated constructor stub
	}

	public int getRewardpoints() {
		return rewardpoints;
	}

	public void setRewardpoints(int rewardpoints) {
		this.rewardpoints = rewardpoints;
	}
	
	
}
