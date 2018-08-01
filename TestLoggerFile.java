package com.jason.logger;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestLoggerFile {

	public static void main(String[] args) throws Exception {
		Logger log = Logger.getLogger(TestLoggerFile.class.getName());
		FileHandler fh;
		fh = new FileHandler("D://myLogger.log", true);
		fh.setFormatter(new SimpleFormatter());
		log.addHandler(fh);
		log.warning("GGininder");
		log.info("info message");

	}

}
