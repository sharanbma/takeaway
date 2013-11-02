package com.khanavali.persistence.services;

import java.util.ArrayList;
import java.util.List;

import com.khanavali.events.customer.AllCustomersEvent;
import com.khanavali.events.customer.CreateCustomerEvent;
import com.khanavali.events.customer.CustomerDetails;
import com.khanavali.events.customer.CustomerDetailsEvent;
import com.khanavali.events.customer.RequestAllCustomersEvent;
import com.khanavali.events.customer.RequestCustomerDetailsEvent;
import com.khanavali.persistence.domain.Customer;
import com.khanavali.persistence.repository.CustomerRepository;

public class CustomerPersistenceEventHandler implements
		CustomerPersistenceService {

	private CustomerRepository customerRepository;

	public CustomerPersistenceEventHandler(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	

	@Override
	public AllCustomersEvent requestAllCustomers(
			RequestAllCustomersEvent requestAllCustomersEvent) {

		Iterable<Customer> customers = customerRepository.findAll();
		List<CustomerDetails> details = new ArrayList<CustomerDetails>();
		for (Customer cust : customers) {
			details.add(cust.toCustomerDetails());
		}
		return new AllCustomersEvent(details);

	}

	@Override
	public CustomerDetailsEvent requestCustomerDetails(
			RequestCustomerDetailsEvent requestCustomerDetailsEvent) {

		Customer customer = null;
		if (requestCustomerDetailsEvent.getId() != 0) {
			customer = customerRepository.findByCustomerId(requestCustomerDetailsEvent
					.getId());
		}

		if (customer == null && requestCustomerDetailsEvent.getUserId() != null) {
			customer = customerRepository
					.findByUserId(requestCustomerDetailsEvent.getUserId());
		}

		if (customer == null
				&& requestCustomerDetailsEvent.getEmailId() != null) {
			customer = customerRepository
					.findByEmailId(requestCustomerDetailsEvent.getEmailId());
		}

		if (customer == null) {
			return CustomerDetailsEvent.notFound(
					requestCustomerDetailsEvent.getEmailId(),
					requestCustomerDetailsEvent.getId());
		}

		return new CustomerDetailsEvent(requestCustomerDetailsEvent.getId(),
				customer.toCustomerDetails());

	}

	@Override
	public CustomerDetailsEvent createCustomer(
			CreateCustomerEvent createCustomerEvent) {
		Customer customer = customerRepository.save(Customer
				.fromCustomerDetails(createCustomerEvent.getDetails()));

		return new CustomerDetailsEvent(customer.getCustomerId(),
				customer.toCustomerDetails());
	}
}
