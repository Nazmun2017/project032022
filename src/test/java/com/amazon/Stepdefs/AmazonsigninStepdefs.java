package com.amazon.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.amazon.PageObjectModel.Amazonsignin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonsigninStepdefs  {
	
	WebDriver driver;
	
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}

	@When("^user clicks on sign in$")
	public void user_clicks_on_sign_in() throws Throwable {
		Amazonsignin SG= new Amazonsignin(driver);
		SG.Signin().click();
		
	   
	}

	@Then("^user will type email and click on continue button$")
	public void user_will_type_email_and_click_on_continue_button() throws Throwable {
		Amazonsignin EM= new Amazonsignin(driver);
		EM.Email().sendKeys("ashiqur.rahman2701@gmail.com");
		EM.Continue().click();
			   
	}

	@Then("^user will type password and click on sign in$")
	public void user_will_type_password_and_click_on_sign_in() throws Throwable {
		Amazonsignin PW= new Amazonsignin(driver);
		PW.Password().sendKeys("Ashique@127");
		PW.Signinsubmit().click();
		
	    
	}

	@Then("^validate customer is on his own page$")
	public void validate_customer_is_on_his_own_page() throws Throwable {
		Amazonsignin VD= new Amazonsignin(driver);
		boolean Result=VD.Ownpage().isDisplayed();
		Assert.assertTrue(Result);
		
		
		
	}


	
	
	

}
