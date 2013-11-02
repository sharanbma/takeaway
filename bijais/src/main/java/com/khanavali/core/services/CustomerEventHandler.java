package com.khanavali.core.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.khanavali.events.customer.AllCustomersEvent;
import com.khanavali.events.customer.CreateCustomerEvent;
import com.khanavali.events.customer.CustomerDetailsEvent;
import com.khanavali.events.customer.RequestAllCustomersEvent;
import com.khanavali.events.customer.RequestCustomerDetailsEvent;
import com.khanavali.persistence.services.CustomerPersistenceService;

public class CustomerEventHandler implements CustomerService {

	
	private CustomerPersistenceService customerPersistenceService;

	public CustomerEventHandler(
			CustomerPersistenceService customerPersistenceService) {
		this.customerPersistenceService = customerPersistenceService;
	}

	@Override
	public AllCustomersEvent requestAllCustomerDetails(
			RequestAllCustomersEvent requestAllCustomersEvent) {
		return this.customerPersistenceService.requestAllCustomers(requestAllCustomersEvent);
	}

	@Override
	public CustomerDetailsEvent requestCustomerDetails(
			RequestCustomerDetailsEvent requestCustomerDetailsEvent) {
		return this.customerPersistenceService.requestCustomerDetails(requestCustomerDetailsEvent);
	}

	@Override
	public CustomerDetailsEvent createCustomer(
			CreateCustomerEvent createCustomerEvent) {
		return this.customerPersistenceService.createCustomer(createCustomerEvent);
	}

}
