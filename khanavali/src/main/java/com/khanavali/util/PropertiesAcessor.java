package com.khanavali.util;

import org.slf4j.Logger;
import com.khanavali.log.LogFactory;


/**
 * @author melkotek 
 * Created on 13 Oct 2013 at 23:23:14 
 * Eclipse IDE
 * 
 * 
 * Just helps getting properties from config bundles
 * 
 */

public class PropertiesAcessor {

	private static final Logger logger = LogFactory
			.getLogger(PropertiesAcessor.class);

	public String getProperty(String property) {
		logger.info("Request for property : " + property);
		return null;
	}
	
	public static void main(String[] args) {
		
		PropertiesAcessor propertiesAccessor = new PropertiesAcessor();
		propertiesAccessor.getProperty("portion.size");
		
	}	

}
