package com.khanavali.core.services;

import com.khanavali.events.customer.AllCustomersEvent;
import com.khanavali.events.customer.CreateCustomerEvent;
import com.khanavali.events.customer.CustomerDetailsEvent;
import com.khanavali.events.customer.RequestAllCustomersEvent;
import com.khanavali.events.customer.RequestCustomerDetailsEvent;

public interface CustomerService {
  AllCustomersEvent requestAllCustomerDetails(RequestAllCustomersEvent requestAllCustomersEvent);
  CustomerDetailsEvent requestCustomerDetails(RequestCustomerDetailsEvent requestCustomerDetailsEvent);
  CustomerDetailsEvent createCustomer(CreateCustomerEvent createCustomerEvent);
}
