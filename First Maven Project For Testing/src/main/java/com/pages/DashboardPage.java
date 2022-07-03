package com.pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	//WebDriver driver = null;

	@FindBy(xpath = "//h3")
	List<WebElement> courses;

	public DashboardPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}

	public boolean verifyingCourses() {
		boolean flag = false;
		for (WebElement course : courses) {
		if(course.isDisplayed())
			flag = true;
		}
		return flag;
	}
		
		public String verifyingCoursesName(){
			String s = null;
			for (WebElement webElement : courses) {
				s= webElement.getText();
				System.out.println(s);
			}
			return s;
			
		}
	
}
