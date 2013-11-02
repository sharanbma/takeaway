package com.khanavali.events.customer;

import com.khanavali.events.RequestReadEvent;

public class RequestCustomerDetailsEvent extends RequestReadEvent {
	private long id;

	private String userId;

	private String emailId;

	public RequestCustomerDetailsEvent(long id, String userId, String emailId) {
		this.id = id;
		this.emailId = emailId;
		this.userId = userId;
	}

	public long getId() {
		return id;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getUserId() {
		return userId;
	}

}
