package com.fdmgroup.stepDef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.DataFile.DataFile;
import com.fdmgroup.Pages.HomePage;
import com.fdmgroup.Pages.LoginPage;
import com.fdmgroup.Pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Z1_Login {
	
	private WebDriver driver;
	private DriverUtilities driverUtilities;
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		
		driverUtilities=DriverUtilities.getInstance();
		driver=driverUtilities.getDriver();
	    
	}

	@When("User open the Zero Banking Application")
	public void user_open_the_zero_banking_application() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.get(DataFile.homePageURL);
	    
	}

	@Then("Signin button should be displayed")
	public void signin_button_should_be_displayed() {
		
		assertEquals(driver.getCurrentUrl(),DataFile.homePageURL);
	    
	}

//	@Given("User open the Zero Banking Application")
//	public void user_open_the_zero_banking_application() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	
	@Given("User launch a browser")
	public void user_launch_a_browser() {
		driverUtilities=DriverUtilities.getInstance();
		driver=driverUtilities.getDriver();

	    }

	@Given("Click signin button on home page of application")
	public void click_signin_button_on_home_page_of_application() throws InterruptedException {
	    
		HomePage.signInButton(driver).click();
		Thread.sleep(1000);
		assertEquals(DataFile.label,driver.findElement(By.tagName("h3")).getText());
		
	}

	@When("User enter the {string} and {string}")
	public void user_enter_the_username_and_password(String user, String psd) throws InterruptedException {
		
		Thread.sleep(1000);
		//LoginPage.username(driver).sendKeys(DataFile.userName);
		LoginPage.username(driver).sendKeys(user);
		Thread.sleep(1000);
		//LoginPage.password(driver).sendKeys(DataFile.passWord);
		LoginPage.password(driver).sendKeys(psd);
		Thread.sleep(1000);
	    
	}
	
	@When("click Signin button")
	public void click_signin_button() {
		LoginPage.signInButton(driver).click();
		driver.navigate().back();
	    }

	@Then("User should be redirected to the home page of user")
	public void user_should_be_redirected_to_the_home_page_of_user() {
	    
		assertEquals(DataFile.userName,UserIndexPage.usernameDropDownMenu(driver).getText());
		
	}
	

}
