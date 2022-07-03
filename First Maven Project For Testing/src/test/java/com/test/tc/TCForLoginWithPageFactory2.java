package com.test.tc;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPageWIthPageFactory;
import com.pages.URL;
import com.pages.DriverOpener;

public class TCForLoginWithPageFactory2 {
	WebDriver driver = null;
	DashboardPage dp = null;

	@Test
	public void checkTitle() {
		WebDriver driver = DriverOpener.webDriverOpening(URL.loginURL);
		LoginPageWIthPageFactory lp = new LoginPageWIthPageFactory(driver);
		lp.automationScript();
		dp = lp.getDashboardPage();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		//driver.close();
	}

	@Test
	public void checkCourses()

	{

		Assert.assertTrue(dp.verifyingCourses());
	}

}
