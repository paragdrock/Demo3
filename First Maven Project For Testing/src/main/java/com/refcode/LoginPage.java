package com.refcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static WebDriver openingBrowser() throws FileNotFoundException, IOException{
		WebDriver driver;
		Properties properties ; 
		driver = new ChromeDriver();
		properties = new Properties();
		properties.load(new FileInputStream("config.properties"));
		String webdriver = properties.getProperty("Webdriver");
		String Chromedriver = properties.getProperty("Chromedriver");
		System.setProperty(webdriver, Chromedriver);
		driver.get(properties.getProperty("URL"));
		return driver;
	}
		
	}
	
