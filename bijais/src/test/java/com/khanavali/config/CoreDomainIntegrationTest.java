package com.khanavali.config;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.khanavali.core.services.CustomerService;
import com.khanavali.core.services.MenuService;
import com.khanavali.events.customer.CustomerDetailsEvent;
import com.khanavali.events.customer.RequestCustomerDetailsEvent;
import com.khanavali.events.menu.AllMenuItemsEvent;
import com.khanavali.events.menu.RequestAllMenuItemsEvent;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class, CoreConfig.class,JPAMysqlConfiguration.class})
public class CoreDomainIntegrationTest {
	
	@Autowired
	MenuService menuService;
	
	@Autowired
	CustomerService customerService;
	
	@Test
	public void thatAllMenuItemsReturned() {
		
	AllMenuItemsEvent allMenuItems = menuService.requestAllMenuItems(new RequestAllMenuItemsEvent());
	
	assertEquals(3, allMenuItems.getMenuItemDetails().size());
			
	}	
	
	@Test
	public void testCustomerRequest(){
		
		CustomerDetailsEvent oneCustomer = customerService.requestCustomerDetails(new RequestCustomerDetailsEvent(0, null, "krishna@gmail.com"));
		
		System.out.println("Customer :  " + oneCustomer);
		
		
	}

}
