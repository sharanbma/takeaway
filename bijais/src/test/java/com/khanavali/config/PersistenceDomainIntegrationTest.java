package com.khanavali.config;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.khanavali.events.customer.AllCustomersEvent;
import com.khanavali.events.customer.CreateCustomerEvent;
import com.khanavali.events.customer.CustomerDetails;
import com.khanavali.events.customer.CustomerDetailsEvent;
import com.khanavali.events.customer.RequestAllCustomersEvent;
import com.khanavali.events.customer.RequestCustomerDetailsEvent;
import com.khanavali.events.menu.AllMenuItemsEvent;
import com.khanavali.events.menu.CreateMenuItemEvent;
import com.khanavali.events.menu.MenuItemDetails;
import com.khanavali.events.menu.RequestAllMenuItemsEvent;
import com.khanavali.persistence.services.CustomerPersistenceService;
import com.khanavali.persistence.services.MenuPersistenceService;
import com.khanavali.web.controller.SiteController;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class,JPAMysqlConfiguration.class})
public class PersistenceDomainIntegrationTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(PersistenceDomainIntegrationTest.class);
	
	@Autowired
	MenuPersistenceService menuPersistenceService;
	
	@Autowired
	CustomerPersistenceService customerPersistenceService;
	
	/**
	@Test
	public void thatAllMenuItemsReturned() {
		
		AllMenuItemsEvent allMenuItems = menuPersistenceService.requestAllMenuItems(new RequestAllMenuItemsEvent());
		assertEquals(3, allMenuItems.getMenuItemDetails().size());
			
	}
	*/
	
	public void createMenuItemsTest(){
		
		MenuItemDetails details1 = new MenuItemDetails("menu001", "Idli", 35.0d, 3);
		MenuItemDetails details2 = new MenuItemDetails("menu002", "Khara Bath", 35.0d, 1);
		MenuItemDetails details3 = new MenuItemDetails("menu003", "Kesari Bath", 35.0d, 1);
		
		CreateMenuItemEvent createItem1 = new CreateMenuItemEvent(details1);
		CreateMenuItemEvent createItem2 = new CreateMenuItemEvent(details2);
		CreateMenuItemEvent createItem3 = new CreateMenuItemEvent(details3);
		
		
		menuPersistenceService.createMenuItem(createItem1);
		menuPersistenceService.createMenuItem(createItem2);
		menuPersistenceService.createMenuItem(createItem3);
		
		AllMenuItemsEvent allMenuItems = menuPersistenceService.requestAllMenuItems(new RequestAllMenuItemsEvent());

		
	}
	
	public void createCustomerTest(){
		
		CustomerDetails custDetails1 = new CustomerDetails(0, "Indira", "Swamy", "indira.swamy@gmail.com", "indira.swamy@gmail.com", "swamy014");
		CustomerDetails custDetails2 = new CustomerDetails(0, "Anantha Swamy", "M K", "mekrua@gmail.com", "mekrua@gmail.com", "swamy009");
		
		CreateCustomerEvent createCustomer1 = new CreateCustomerEvent(custDetails1);
		CreateCustomerEvent createCustomer2 = new CreateCustomerEvent(custDetails2);
		
		customerPersistenceService.createCustomer(createCustomer1);
		customerPersistenceService.createCustomer(createCustomer2);
		
	}
	
	@Test
	public void retrieveCustomerTest(){
		
		RequestAllCustomersEvent custs = new RequestAllCustomersEvent();
		AllCustomersEvent customers = customerPersistenceService.requestAllCustomers(custs);
		
		List<CustomerDetails> allCustomers = customers.getCustomerDetails();
		
		for(CustomerDetails detail : allCustomers){
			LOG.info("Customer : " + detail);
		}
		
		CustomerDetailsEvent details = customerPersistenceService.requestCustomerDetails(new RequestCustomerDetailsEvent(0, null, "krishna@gmail.com"));
		
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Details : " + details);
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}
	

}
