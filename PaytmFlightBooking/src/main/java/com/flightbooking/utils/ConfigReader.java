package com.flightbooking.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties properties;

	static {
		try {

			InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
			if (input == null) {
				throw new FileNotFoundException("Property file not found in the classpath");
			}
			properties = new Properties();
			properties.load(input);
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
}
