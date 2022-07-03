package com.test.tc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.RegistrationCredential;
import com.pages.URL;
import com.pages.DriverOpener;

public class TCRegistrationPage {
	WebDriver driver = null;

	/*@BeforeClass

	public void openBroswer() {
		driver = WebDriverOpen.webDriverOpening();
	}*/

	@Test(priority = 1)
	public void checkTitle() {
		driver = DriverOpener.webDriverOpening(URL.registrationURL);
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Registration Page");
		driver.close();
	}

	@Test(priority = 2)
	public void textCheckJavaByKiran() {
		driver = DriverOpener.webDriverOpening(URL.registrationURL);
		String excpt = driver.findElement(By.xpath("//b")).getText();
		Assert.assertEquals(excpt, "Java By Kiran");
		driver.close();
	}

	@Test(priority = 3)
	public void textCheckRegisterANewMembership() {
		driver = DriverOpener.webDriverOpening(URL.registrationURL);
		String excpt = driver.findElement(By.xpath("//p")).getText();
		Assert.assertEquals(excpt, "Register a new membership");
		driver.close();
	}

	@Test(priority = 4)
	public void blankCredential() {
		driver = DriverOpener.webDriverOpening(URL.registrationURL);
		RegistrationCredential rc = new RegistrationCredential(driver);
		rc.automationScript("", "", "", "");
		String nameErr = driver.findElement(By.id("name_error")).getText();
		String mobileErr = driver.findElement(By.id("mobile_error")).getText();
		String emailErr = driver.findElement(By.id("email_error")).getText();
		String passwordErr = driver.findElement(By.id("password_error")).getText();
		Assert.assertEquals(nameErr, "Please enter Name.");
		Assert.assertEquals(mobileErr, "Please enter Mobile.");
		Assert.assertEquals(emailErr, "Please enter Email.");
		Assert.assertEquals(passwordErr, "Please enter Password.");
		driver.close();
	}

	@Test(priority = 5)
	public void addingUser() throws InterruptedException {
		driver = DriverOpener.webDriverOpening(URL.registrationURL);
		RegistrationCredential rc = new RegistrationCredential(driver);
		rc.automationScript("parag", "9089098", "parag@gmail.com", "parag");
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		String alertText=alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "User registered successfully.");
		driver.close();
	}

	@Test(priority = 6)
	public void checkHyperlinkAlreadyHaveMembership() {
		driver = DriverOpener.webDriverOpening(URL.registrationURL);
		driver.findElement(By.xpath("//a[text()='I already have a membership']")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
		driver.close();
	}

	/*@AfterClass
	public void closeBrowser() {
		driver.close();
	}*/

}
