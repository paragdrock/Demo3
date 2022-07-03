package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegistrationPage {

	@FindBy(xpath = "//input[@type]")
	List<WebElement> credential;// 1name, 2mobile, 3email, 4password

	@FindBy(xpath = "//button")
	WebElement signIn;

	@FindBy(xpath = "//div[@id]")
	List<WebElement> errMsg;// nameErr, mobileErr, emailErr, passwordErr

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyingCredential() {
		for (WebElement webElement : credential) {

			System.out.println(webElement + " ");
		}
	}

	public void errMsgs() {
		for (WebElement webElement : errMsg) {

		}
	}
}
