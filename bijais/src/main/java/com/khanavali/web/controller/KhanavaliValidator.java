package com.khanavali.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.khanavali.core.services.CustomerService;
import com.khanavali.web.domain.CustomerInfo;

public class KhanavaliValidator implements Validator {

	@Autowired
	private CustomerService customerService;

	@Override
	public boolean supports(Class<?> arg0) {
		return CustomerInfo.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		CustomerInfo customerInfo = (CustomerInfo) arg0;

	}
}
