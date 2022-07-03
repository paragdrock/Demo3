package com.refcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.W3CHttpResponseCodec;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Alert code
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();

	}
}
