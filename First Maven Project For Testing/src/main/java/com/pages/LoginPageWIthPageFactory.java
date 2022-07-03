package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class LoginPageWIthPageFactory {
	WebDriver driver = null;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(xpath = "//button")
	WebElement signInBtn;

	public LoginPageWIthPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	public void loginToApplication(String Email, String Pass) {
		email.sendKeys(Email);
		password.sendKeys(Pass);
		signInBtn.click();
	}
	
	public void automationScript() {
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		signInBtn.click();
	}
	 
	public DashboardPage getDashboardPage() {
		automationScript();
		 return new DashboardPage(driver);
	}
	
}
