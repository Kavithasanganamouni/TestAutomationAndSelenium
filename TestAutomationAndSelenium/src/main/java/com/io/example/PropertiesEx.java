package com.io.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesEx {
	static Properties prop = new Properties();
	public static void readProperties() {
		// specifying the location of the config.properties file
		try {// Handling the exceptions
			InputStream is = new FileInputStream(
					"C:\\Users\\Kavitha\\eclipse-workspace\\TestAutomationAndSelenium\\src\\main\\java\\config.properties");
			prop.load(is);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
