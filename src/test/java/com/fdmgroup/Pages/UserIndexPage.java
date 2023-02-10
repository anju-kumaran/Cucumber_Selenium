package com.fdmgroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserIndexPage {
	
	public static WebElement usernameDropDownMenu(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='settingsBox']/ul/li[3]/a"));
	}
	
	public static WebElement logoutLink(WebDriver driver)
	{
		return driver.findElement(By.linkText("Logout"));
	}

}
