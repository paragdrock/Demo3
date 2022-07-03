package com.test.tc;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPageWIthPageFactory;
import com.pages.URL;
import com.pages.DriverOpener;

public class TCForLoginWithPageFactory3 {
	WebDriver driver = null;
	DashboardPage dp = null;
	LoginPageWIthPageFactory lp=null;

	@Test
	public void checkTitle() {
		WebDriver driver = DriverOpener.webDriverOpening(URL.loginURL);
		lp = new LoginPageWIthPageFactory(driver);
		dp = lp.getDashboardPage();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");

	}

	@Test(priority = 1)
	public void checkCourses() {
		boolean expt = dp.verifyingCourses();
		Assert.assertTrue(expt);
	}

}
