package com.khanavali.events.customer;

import com.khanavali.events.ReadEvent;

import java.util.List;

public class AllCustomersEvent extends ReadEvent {
	private List<CustomerDetails> customerDetails;

	public AllCustomersEvent(List<CustomerDetails> customerDetails) {
		this.customerDetails = customerDetails;
	}

	public List<CustomerDetails> getCustomerDetails() {
		return customerDetails;
	}
}
