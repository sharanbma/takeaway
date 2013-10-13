package com.khanavali.log;

import org.slf4j.LoggerFactory;

/**
 * @author melkotek
 * Created on 13 Oct 2013 at 23:18:41
 * Eclipse IDE
 *
 */

public class LogFactory {

	public static org.slf4j.Logger getLogger(Class clazz){
		org.slf4j.Logger logger = LoggerFactory.getLogger(clazz); 
		return  logger; 
	}
	
}
