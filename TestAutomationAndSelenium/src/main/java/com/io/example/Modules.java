package com.io.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Modules {
	public static WebDriver driver;
	static String browser;
	public static void setBrowser() {
		PropertiesEx.readProperties();
		browser=PropertiesEx.prop.getProperty("browser");//getting the browser from config.properties file
	}
	public static void setBrowserConfig() {
		if(browser.equals("opera")) {
			//specifying the location the web browser
			System.setProperty("webdriver.opera.driver", "C:\\Users\\Kavitha\\eclipse-workspace\\TestAutomationAndSelenium\\src\\main\\java\\operadriver.exe");
		}
	}
	public static void runTest() {
		driver=new OperaDriver();
		driver.get(PropertiesEx.prop.getProperty("url"));// getting the url from propertiesEx file		
	}
	public static void endTest() {
		driver.quit();
	}
}
