package com.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
	

		public static Logger Log=Logger.getLogger(Log4j.class);

		public static void info(String Message)

		{

		PropertyConfigurator.configure("Log4j.properties");

		Log.info(Message);

		
}
}
