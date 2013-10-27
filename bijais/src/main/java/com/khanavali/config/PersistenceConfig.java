package com.khanavali.config;

import com.khanavali.persistence.domain.MenuItem;
import com.khanavali.persistence.domain.Order;
import com.khanavali.persistence.repository.*;
import com.khanavali.persistence.services.MenuPersistenceEventHandler;
import com.khanavali.persistence.services.MenuPersistenceService;
import com.khanavali.persistence.services.OrderPersistenceEventHandler;
import com.khanavali.persistence.services.OrderPersistenceService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Configuration
public class PersistenceConfig {

  @Bean
  public OrdersRepository orderRepository() {
    return new OrdersMemoryRepository(new HashMap<String, Order>());
  }
  @Bean
  public OrderStatusRepository orderStatusRepository() {
    return new OrderStatusMemoryRepository();
  }
  @Bean
  public OrderPersistenceService ordersPersistenceService() {
    return new OrderPersistenceEventHandler(orderRepository(), orderStatusRepository());
  }

	@Bean
	public MenuItemRepository menuItemRepository() {
		return new MenuItemMemoryRepository(defaultMenu());
	}

	@Bean
	public MenuPersistenceService menuPersistenceService(MenuItemRepository menuItemRepository) {
		return new MenuPersistenceEventHandler(menuItemRepository);
	}
	
	private Map<String, MenuItem> defaultMenu() {
		Map<String, MenuItem> items = new HashMap<String, MenuItem>();
		items.put("YM1", menuItem("YM1", new BigDecimal("1.99"), 11, "Yummy Noodles"));
		items.put("YM2", menuItem("YM2", new BigDecimal("2.99"), 12, "Special Yummy Noodles"));
		items.put("YM3", menuItem("YM3", new BigDecimal("3.99"), 13, "Low cal Yummy Noodles"));
		return items;
	}

	private MenuItem menuItem(String id, BigDecimal cost, int minutesToPrepare, String name) {
		MenuItem item = new MenuItem();
		item.setId(id);
		item.setCost(cost);
		item.setMinutesToPrepare(minutesToPrepare);
		item.setName(name);
		return item;
	}

}
