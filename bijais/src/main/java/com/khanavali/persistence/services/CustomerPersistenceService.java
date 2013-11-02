package com.khanavali.persistence.services;

import com.khanavali.events.customer.AllCustomersEvent;
import com.khanavali.events.customer.CreateCustomerEvent;
import com.khanavali.events.customer.CustomerDetailsEvent;
import com.khanavali.events.customer.RequestAllCustomersEvent;
import com.khanavali.events.customer.RequestCustomerDetailsEvent;

public interface CustomerPersistenceService {

  AllCustomersEvent requestAllCustomers(RequestAllCustomersEvent requestAllCustomersEvent);
  CustomerDetailsEvent requestCustomerDetails(RequestCustomerDetailsEvent requestCustomerDetailsEvent);
  CustomerDetailsEvent createCustomer(CreateCustomerEvent createCustomerEvent);

}
