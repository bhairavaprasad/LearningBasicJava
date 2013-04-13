package com.tss.test.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * In this example you learn how to limit the size of a log file when using a
 * FileHandler handler. Limiting the log file will prevent the log file to grow
 * wildly without limit.
 */
public class LogFileLimit
{
	//
	// The log file size is set to 1MB.
	//
	public static final int FILE_SIZE = 1024 * 1024;
	
	public static void main(String[] args)
	{
		Logger logger = Logger.getLogger(LogFileLimit.class.getName());
		
		try
		{
			//
			// Create a FileHandler with 1MB file size and a single log file. We
			// also tell the handler to append the log message.
			//
			FileHandler handler = new FileHandler("myapp.log", FILE_SIZE, 1, true);
			logger.addHandler(handler);
		}
		catch (IOException e)
		{
			logger.warning("Failed to initialize logger handler.");
		}
		
		logger.info("Test info");
		logger.warning("Test warning");
		logger.severe("Test severe");
	}
}
