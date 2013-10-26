package com.khanavali.web.controller;

import com.khanavali.core.services.MenuService;
import com.khanavali.events.menu.RequestAllMenuItemsEvent;
import com.khanavali.web.controller.SiteController;
import com.khanavali.web.domain.Basket;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static com.khanavali.web.controller.fixture.WebDataFixture.allMenuItems;
import static org.hamcrest.Matchers.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SiteIntegrationTest {
	
	private static final String STANDARD = "Yummy Noodles";
	private static final String CHEF_SPECIAL = "Special Yummy Noodles";
	private static final String LOW_CAL = "Low cal Yummy Noodles";
	private static final String FORWARDED_URL = "/WEB-INF/views/home.html";
	private static final String VIEW = "/home";
	
	
	MockMvc mockMvc;
	
	@InjectMocks
	SiteController controller;
	
	@Mock
	MenuService menuService;
	
	@Mock
	Basket basket;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
						
		mockMvc = standaloneSetup(controller)
				.setViewResolvers(viewResolver())
				.build();
		
		when(menuService.requestAllMenuItems(any(RequestAllMenuItemsEvent.class))).thenReturn(allMenuItems());

	}

	private InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views");
		viewResolver.setSuffix(".html");
		return viewResolver;
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void rootUrlPopulatesViewModel() throws Exception {
		mockMvc.perform(get("/"))
		.andDo(print())
		.andExpect(model().size(2))
		.andExpect(model().attribute("menuItems", hasSize(3)))
		.andExpect(model().attribute("menuItems", hasItems(hasProperty("name", is(STANDARD)),
        hasProperty("name", is(CHEF_SPECIAL)),
        hasProperty("name", is(LOW_CAL)))))

		.andExpect(model().attributeExists("basket"));
	}
	
	@Test
	public void rootUrlforwardsCorrectly() throws Exception {
		mockMvc.perform(get("/"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(view().name(VIEW))
		.andExpect(forwardedUrl(FORWARDED_URL));

	}

}
