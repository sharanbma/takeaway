package com.khanavali.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.khanavali.core.services.CustomerEventHandler;
import com.khanavali.core.services.CustomerService;
import com.khanavali.core.services.MenuEventHandler;
import com.khanavali.core.services.MenuService;
import com.khanavali.core.services.OrderEventHandler;
import com.khanavali.core.services.OrderService;
import com.khanavali.persistence.services.CustomerPersistenceService;
import com.khanavali.persistence.services.MenuPersistenceService;
import com.khanavali.persistence.services.OrderPersistenceService;

@Configuration
public class CoreConfig {
	@Bean
	public MenuService menuService(MenuPersistenceService menuPersistenceService) {
		return new MenuEventHandler(menuPersistenceService);
	}

	@Bean
	public OrderService orderService(
			OrderPersistenceService orderPersistenceService) {
		return new OrderEventHandler(orderPersistenceService);
	}

	@Bean
	public CustomerService customerService(
			CustomerPersistenceService customerPersistenceService) {
		return new CustomerEventHandler(customerPersistenceService);
	}

}
