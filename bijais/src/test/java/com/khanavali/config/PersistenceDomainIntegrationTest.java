package com.khanavali.config;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.khanavali.PersistenceConfig;
import com.khanavali.events.menu.AllMenuItemsEvent;
import com.khanavali.events.menu.RequestAllMenuItemsEvent;
import com.khanavali.persistence.services.MenuPersistenceService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class})
public class PersistenceDomainIntegrationTest {
	
	@Autowired
	MenuPersistenceService menuPersistenceService;
		
	@Test
	public void thatAllMenuItemsReturned() {
		
	AllMenuItemsEvent allMenuItems = menuPersistenceService.requestAllMenuItems(new RequestAllMenuItemsEvent());
	
	assertEquals(3, allMenuItems.getMenuItemDetails().size());
			
	}

}
