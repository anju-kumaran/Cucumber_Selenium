package com.fdmgroup.stepDef;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.Pages.HomePage;
import com.fdmgroup.Pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Z2_Logout {
	
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Before
	public void setup() {
		driverUtilities=DriverUtilities.getInstance();
		driver=driverUtilities.getDriver();
				
	}
	
	@Given("User click the username dropdown button")
	public void user_click_the_username_dropdown_button() throws InterruptedException {
		Thread.sleep(1000);
	UserIndexPage.usernameDropDownMenu(driver).click();    
	}

	@When("User click the logout button")
	public void user_click_the_logout_button() throws InterruptedException {
		Thread.sleep(1000);
		UserIndexPage.logoutLink(driver).click();
	    }

	@Then("User check the sigin button on current page")
	public void user_check_the_sigin_button_on_current_page() {
		assertTrue(HomePage.signInButton(driver).isDisplayed());
	    }

}
