package com.wordpress.posts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects_wordpress.DashboardPageObject;
import pageObjects_wordpress.LoginPageObject;

public class Level04_Login_Multi_Browser extends BaseTest {
	WebDriver driver;
	String projectLocator = System.getProperty("user.dir");
	LoginPageObject loginPage;
	DashboardPageObject dashboardPage;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		getBrowserDriver(browserName);
	}
	
	@Parameters("url")
	@BeforeMethod // Lặp lại bước này cho all testcase
	public void beforeMethod(String appUrl) {
		driver.get(appUrl);
		loginPage = new LoginPageObject(driver);
	}

	@Test
	public void TC01_Empty_Email_Username() {
		loginPage.inputToUsernameTextbox("");
		loginPage.clickToContinueButton();
		loginPage.sleepInsecond(2);
		Assert.assertTrue(loginPage.isEmptyEmailErrorMessageDisplayed());
			
	}

	
	public void TC02_Invalid_Email() {
		loginPage.inputToUsernameTextbox("automation@aaaa");
		loginPage.clickToContinueButton();
		loginPage.sleepInsecond(2);
		String userNotExitsMessage = loginPage.getInvalidEmailErrorMessage();
		Assert.assertEquals(userNotExitsMessage, "User does not exist. Would you like to create a new account?");

	}

	
	public void TC03_Username_Not_Exits() {
		loginPage.inputToUsernameTextbox("automationkfc54234@gmail.com");
		loginPage.clickToContinueButton();
		loginPage.sleepInsecond(2);
		String userNotExitsMessage = loginPage.getInvalidEmailErrorMessage();
		Assert.assertEquals(userNotExitsMessage, "User does not exist. Would you like to create a new account?");

	}

	
	public void TC04_Empty_Password() {
		loginPage.inputToUsernameTextbox("automationtvt@gmail.com");
		loginPage.clickToContinueButton();
		loginPage.sleepInsecond(2);
		
		loginPage.inputToPasswordTextbox("");
		loginPage.clickToLoginButton();
		loginPage.sleepInsecond(2);
		Assert.assertTrue(loginPage.isEmptyPasswordErrorMessageDisplayed());
		
	}


	public void TC05_Invalid_Password() {
		loginPage.inputToUsernameTextbox("automationtvt@gmail.com");
		loginPage.clickToContinueButton();
		loginPage.sleepInsecond(2);
		
		loginPage.inputToPasswordTextbox("12");
		loginPage.clickToLoginButton();
		loginPage.sleepInsecond(2);
		Assert.assertTrue(loginPage.isInvalidPasswordErrorMessageDisplayed());

	}


	@Test
	public void TC06_Valid_Email_Password() {
		loginPage.inputToUsernameTextbox("automationtvt@gmail.com");
		loginPage.clickToContinueButton();
		loginPage.sleepInsecond(2);
		
		loginPage.inputToPasswordTextbox("123456?Aa");
		loginPage.clickToLoginButton();
		loginPage.sleepInsecond(2);
		
		// Chuyển page theo business: từ Login qua Dashboard
		dashboardPage = new DashboardPageObject(driver);
		Assert.assertTrue(dashboardPage.isDashboardHeaderTextDisplayed());

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
