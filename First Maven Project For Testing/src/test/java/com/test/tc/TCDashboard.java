package com.test.tc;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPageWIthPageFactory;
import com.pages.URL;
import com.pages.DashboardPage;
import com.pages.DriverOpener;

public class TCDashboard {
	WebDriver driver =null;
	LoginPageWIthPageFactory lp=null;
	DashboardPage dp  = null;
	@Test
	public void checkTitle(){
		driver = DriverOpener.webDriverOpening(URL.loginURL);
		lp = new LoginPageWIthPageFactory(driver);
		dp=lp.getDashboardPage();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	
	}
	
	@Test(priority=1)
	public void checkCoursesName(){
	dp.verifyingCoursesName();
		Assert.assertTrue(dp.verifyingCourses());

	}
	
}
