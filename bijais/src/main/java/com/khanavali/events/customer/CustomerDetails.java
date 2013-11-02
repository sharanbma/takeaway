package com.khanavali.events.customer;

public class CustomerDetails {

	private long customerId;
	private String firstName;
	private String lastName;

	private String userId;
	private String emailId;

	private String password;

	public CustomerDetails(long id, String firstName, String lastName,
			String userId, String emailId, String password) {
		this.customerId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.emailId = emailId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
