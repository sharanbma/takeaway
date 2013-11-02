package com.khanavali.events.customer;

import com.khanavali.events.ReadEvent;

public class CustomerDetailsEvent extends ReadEvent {

	private long id;
	private String key;
	private CustomerDetails customerDetails;

	private CustomerDetailsEvent() {
	}

	public CustomerDetailsEvent(String key, CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public CustomerDetailsEvent(long id, CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public long getId() {
		return id;
	}

	public String getKey() {
		return key;
	}

	public static CustomerDetailsEvent notFound(String key, long id) {
		CustomerDetailsEvent ev = new CustomerDetailsEvent();
		ev.id = id;
		ev.key = key;
		ev.entityFound = false;
		return ev;
	}
}
