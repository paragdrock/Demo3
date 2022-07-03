package com.pages;

import org.openqa.selenium.WebDriver;

public class MainREg {
public static void main(String[] args) {
	WebDriver driver =DriverOpener.webDriverOpening(URL.registrationURL);
	RegistrationPage rp = new RegistrationPage(driver);
	rp.verifyingCredential();
	
}
}
