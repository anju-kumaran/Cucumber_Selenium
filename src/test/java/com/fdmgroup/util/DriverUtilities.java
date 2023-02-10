package com.fdmgroup.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtilities {
	
	private static DriverUtilities driverUtilities;
	private WebDriver driver;
	
	
	public DriverUtilities()
	{
		super();
	}
	
	public static DriverUtilities getInstance()
	{
		if (driverUtilities == null)
			driverUtilities = new DriverUtilities();
		
		return driverUtilities;
	}
	
//	public static void main(String[] args) {
//		DriverUtilities driver1 = DriverUtilities.getInstance();
//		System.out.println(driver1.hashCode());
//		
//		DriverUtilities driver2 = DriverUtilities.getInstance();
//		System.out.println(driver1.hashCode());
//		
//	}
	
	public WebDriver getDriver()
	{
		if(driver == null)
			createDriver();
		return driver;
		
	}

	private void createDriver() {
		
		String driverName = getDriverName();
		
		switch(driverName) {
		
		case "google chrome":
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
			this.driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
			this.driver=new FirefoxDriver();
			break;
			
		default:
			System.out.println("Browser name is invalid");
		}
		
	}

	private String getDriverName() {
		
		String driverName = "";
		Properties config = new Properties();
		
		try {
			config.load(new FileInputStream("src\\test\\resources\\config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String Key :config.stringPropertyNames())
			if(Key.equals("browser"))
				driverName = config.getProperty(Key);
		
		return driverName;
	}
	

}
