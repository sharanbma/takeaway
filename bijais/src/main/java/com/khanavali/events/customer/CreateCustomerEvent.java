package com.khanavali.events.customer;


import com.khanavali.events.CreateEvent;

public class CreateCustomerEvent extends CreateEvent {

  private CustomerDetails details;

  public CreateCustomerEvent(CustomerDetails details) {
    this.details = details;
  }

  public CustomerDetails getDetails() {
    return details;
  }
}
