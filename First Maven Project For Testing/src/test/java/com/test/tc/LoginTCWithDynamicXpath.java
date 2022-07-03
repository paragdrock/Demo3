package com.test.tc;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.refcode.LoginPage;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import sun.rmi.runtime.Log;

public class LoginTCWithDynamicXpath {
	WebDriver driver;
	
	/*@BeforeClass
	public void openBrowser() throws FileNotFoundException, IOException{
		driver =LoginPage.openingBrowser();
	}
	@Test
	public void checkTitle() throws Exception{
		//driver =LoginPage.openingBrowser();
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, "JavaByKiran | Log in");
		//driver.close();
	}
	@Test
	public void isDisplayed() throws FileNotFoundException, IOException{
		//driver =LoginPage.openingBrowser();
		WebElement img = driver.findElement(By.xpath("//img"));
		boolean val = img.isDisplayed();
		Assert.assertEquals(val, true);
	//driver.close();
	}
	@Test
	public void textCheck() throws FileNotFoundException, IOException{
		//driver = LoginPage.openingBrowser();
		WebElement text = driver.findElement(By.xpath("//a/b"));
		String txt = text.getText();
		Assert.assertEquals(txt, "Java By Kiran");
		//driver.close();
	}
	@Test
	public void textCheck2() throws FileNotFoundException, IOException{
		//driver = LoginPage.openingBrowser();
		String txt = driver.findElement(By.xpath("//h4")).getText();
		Assert.assertEquals(txt,"JAVA | SELENIUM | PYTHON");
		//driver.close();
	}
		@Test
		public void signIntextCheck() throws FileNotFoundException, IOException{
	//driver  = LoginPage.openingBrowser();
	String txt = driver.findElement(By.xpath("//h4//following :: p")).getText();
	Assert.assertEquals(txt, "Sign in to start your session");
//driver.close();
	}
		@Test
		public void blankCredential() throws FileNotFoundException, IOException
		{
			//driver = LoginPage.openingBrowser();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		String errPassmsg = driver.findElement(By.xpath("//div[text()='Please enter password.']")).getText();
		String errEmailMSg = driver.findElement(By.xpath("//div[text()='Please enter email.']")).getText();
		Assert.assertEquals(errEmailMSg,"Please enter email.");
		Assert.assertEquals(errPassmsg, "Please enter password.");
		//driver.close();
		}*/
	@Test
	public void validCredential() throws FileNotFoundException, IOException{
		driver = LoginPage.openingBrowser();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
	driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	String dash = driver.findElement(By.xpath("//h1[contains(text(),'Dash')]")).getText();
	Assert.assertEquals(dash,"Dashboard Courses Offered");
	
	 driver.close();
	}
	 	/*
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		}
*/
}
