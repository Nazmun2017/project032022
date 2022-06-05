package com.amazon.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonsignin {
	
	WebDriver driver;
	
	public Amazonsignin (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement click_signin;
	public WebElement Signin () {
		return click_signin;	
	}
	@FindBy(xpath="//input[@type='email']")
	WebElement edit_email;
	public WebElement Email () {
		return edit_email;	
	}
	@FindBy(xpath="//input[@id='continue']")
	WebElement click_continue;
	public WebElement Continue () {
		return click_continue;	
	}
	@FindBy(xpath="//input[@type='password']")
	WebElement edit_password;
	public WebElement Password () {
		return edit_password;	
	}
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement  click_signinsubmit;
	public WebElement Signinsubmit () {
		return click_signinsubmit;	
	}
	@FindBy(xpath="//span[@id='glow-ingress-line2']")
	WebElement verify_ownpage;
	public WebElement Ownpage () {
		return verify_ownpage;	
	}
	

}
