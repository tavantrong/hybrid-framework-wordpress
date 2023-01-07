package com.wordpress.posts;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Level01_Login_Repeat_Yourself {
	WebDriver driver;
	String projectLocator = System.getProperty("user.dir");

	By usernameTextboxBy = By.name("login[username]");
	By passwordTextboxBy = By.name("login[password]");
	By loginButtonBy = By.xpath("//button[@title='Login']");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectLocator + "\\browserDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@BeforeMethod // Lặp lại bước này cho all testcase
	public void beforeMethod() {
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
	}

	@Test
	public void TC01_Empty_Email_Username() {
		driver.findElement(usernameTextboxBy).sendKeys("");
		driver.findElement(loginButtonBy).click();
		sleepInSecond(2);

		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).isDisplayed());
	}

	@Test
	public void TC02_Invalid_Email() {
		driver.findElement(usernameTextboxBy).sendKeys("automation" + getRandomNumber() + "@aaaa");
		driver.findElement(loginButtonBy).click();
		sleepInSecond(2);

		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advice-validate-email-email']")).isDisplayed());
	}

	@Test
	public void TC03_Username_Not_Exits() {
		driver.findElement(usernameTextboxBy).sendKeys("automationkfc" + getRandomNumber() + "@gmail.com");
		driver.findElement(passwordTextboxBy).sendKeys("123456");
		driver.findElement(loginButtonBy).click();
		sleepInSecond(2);

		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Invalid login or password.']")).isDisplayed());
	}

	@Test
	public void TC04_Empty_Password() {
		driver.findElement(usernameTextboxBy).sendKeys("automationtvt@gmail.com");
		driver.findElement(passwordTextboxBy).sendKeys("");
		driver.findElement(loginButtonBy).click();
		sleepInSecond(2);

		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).isDisplayed());

	}

	@Test
	public void TC05_Invalid_Password() {
		driver.findElement(usernameTextboxBy).sendKeys("automationtvt@gmail.com");
		driver.findElement(passwordTextboxBy).sendKeys("123");
		driver.findElement(loginButtonBy).click();
		sleepInSecond(2);

		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advice-validate-password-pass']")).isDisplayed());

	}

	@Test
	public void TC06_Incorrect_Password() {
		driver.findElement(usernameTextboxBy).sendKeys("automationtvt@gmail.com");
		driver.findElement(passwordTextboxBy).sendKeys("1234567");
		driver.findElement(loginButtonBy).click();
		sleepInSecond(2);

		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Invalid login or password.']")).isDisplayed());

	}

	@Test
	public void TC07_Valid_Email_Password() {
		driver.findElement(usernameTextboxBy).sendKeys("automationtvt@gmail.com");
		driver.findElement(passwordTextboxBy).sendKeys("123456");
		driver.findElement(loginButtonBy).click();
		sleepInSecond(2);

		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='My Dashboard']")).isDisplayed());

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(99999);
	}

	public void sleepInSecond(long timeout) {
		try {
			Thread.sleep(timeout * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
