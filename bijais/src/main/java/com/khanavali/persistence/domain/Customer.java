package com.khanavali.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import com.khanavali.events.customer.CustomerDetails;

@Entity
@NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long customerId;

	private boolean active;

	private boolean blacklisted;

	private String emailId;

	private String firstName;

	private String lastName;

	private String middleName;

	private String mobileNumber;

	private String phoneNumber;

	private String userId;

	private String password;
	
	private String addressHouseNameNumber;
	
	private String addressFirstLine;
	
	private String addressSecondLine;
	
	private String postcode;
		
	
	public String getAddressHouseNameNumber() {
		return addressHouseNameNumber;
	}

	public void setAddressHouseNameNumber(String addressHouseNameNumber) {
		this.addressHouseNameNumber = addressHouseNameNumber;
	}

	public String getAddressFirstLine() {
		return addressFirstLine;
	}

	public void setAddressFirstLine(String addressFirstLine) {
		this.addressFirstLine = addressFirstLine;
	}

	public String getAddressSecondLine() {
		return addressSecondLine;
	}

	public void setAddressSecondLine(String addressSecondLine) {
		this.addressSecondLine = addressSecondLine;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isBlacklisted() {
		return blacklisted;
	}

	public void setBlacklisted(boolean blacklisted) {
		this.blacklisted = blacklisted;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CustomerDetails toCustomerDetails(){
		CustomerDetails details = new CustomerDetails(customerId, firstName, lastName, userId, emailId, password);
		return details;
	}
	
	public static Customer fromCustomerDetails(CustomerDetails customerDetails) {
		Customer customer = new Customer();

		customer.emailId = customerDetails.getEmailId();
		customer.userId = customerDetails.getUserId();
		customer.customerId = customerDetails.getCustomerId();
		customer.firstName = customerDetails.getFirstName();
		customer.lastName = customerDetails.getLastName();
		
		return customer;
	}
	
}
