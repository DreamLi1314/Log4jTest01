package com.inetsoft.log4j;

import org.apache.log4j.Logger;

public class Log4jTest01 {
	
	private static Logger LOGGER = Logger.getLogger(Log4jTest01.class);
	
	public static void main(String[] args) {
		System.out.println("This is print message..." + LOGGER);
		
		//debug 级别的日志
		LOGGER.debug("This is debug level message...");
		
		//info 级别的日志
		LOGGER.info("This is info level message...");
		
		//error 级别的日志
		LOGGER.error("This is error level message...");
	}
}
