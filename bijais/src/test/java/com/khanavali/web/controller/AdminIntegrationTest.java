package com.khanavali.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class AdminIntegrationTest {

	MockMvc mockMvc;

	@InjectMocks
	AdminController controller;

	//{!begin init}
	@Before
	public void setup() {
		
		MockitoAnnotations.initMocks(this);
		mockMvc = standaloneSetup(controller).setViewResolvers(viewResolver())
				.build();
	}

	private InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views");
		viewResolver.setSuffix(".html");
		return viewResolver;
	}
   //{!end init}

	@Test
	public void thatMenuAdminIsInvoked() throws Exception {
		mockMvc.perform(get("/admin/menu")).andDo(print());
	}

	@Test
	public void thatOrderAdminIsInvoked() throws Exception {
		mockMvc.perform(get("/admin/order")).andDo(print());
	}
	
	@Test
	public void thatCustomerAdminIsInvoked() throws Exception {
		mockMvc.perform(get("/admin/customer")).andDo(print());
	}
}
