package com.fdmgroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement signInButton(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[contains(@id,'signin_button')]"));
	}
	
	public static WebElement zeroBankLogo(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[contains(@class,'brand')]"));
	}

}
