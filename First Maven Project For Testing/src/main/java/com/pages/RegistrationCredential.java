	package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationCredential {
	@FindBy(id="name")
	WebElement name;
	@FindBy(id="mobile")
	WebElement mobile;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//button")
	WebElement signIn;
	
	public RegistrationCredential(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void automationScript(String name,String moblie,String Email,String password){
		this.name.sendKeys(name);
		this.mobile.sendKeys(moblie);
		this.email.sendKeys(Email);
		this.password.sendKeys(password);
		signIn.click();
			}
}
