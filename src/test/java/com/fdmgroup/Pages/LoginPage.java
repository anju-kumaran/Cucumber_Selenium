package com.fdmgroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebElement username(WebDriver driver) {
		
		return driver.findElement(By.name("user_login"));
	}
	
	public static WebElement password(WebDriver driver) {
		
		return driver.findElement(By.name("user_password"));
	}
	
	public static WebElement signInButton(WebDriver driver) {
		
		return driver.findElement(By.name("submit"));
	}
	
	public static WebElement webPageHeader(WebDriver driver) {
		
		return driver.findElement(By.tagName("h3"));
	}

}
