package com.test.tc;

import org.openqa.selenium.
 	WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPageWIthPageFactory;
import com.pages.URL;
import com.pages.DriverOpener;

public class TCForLoginWithPageFactory {
	WebDriver driver=null;
	DashboardPage dp=null;
@Test
public void checkTitle(){
	WebDriver driver = DriverOpener.webDriverOpening(URL.loginURL);
	LoginPageWIthPageFactory lp = new LoginPageWIthPageFactory(driver);
	lp.automationScript();
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	driver.close();
}

@Test
public void checkCourses()

	{
	WebDriver driver = DriverOpener.webDriverOpening(URL.loginURL);
	//opening Browser
	LoginPageWIthPageFactory lp = new LoginPageWIthPageFactory(driver);
	//calling initElements
	lp.automationScript();
	//sending keys
	dp= new DashboardPage(driver);
	//creating obj to call verifyCourses
	boolean expt = dp.verifyingCourses();
	Assert.assertTrue(expt);
	}


}
