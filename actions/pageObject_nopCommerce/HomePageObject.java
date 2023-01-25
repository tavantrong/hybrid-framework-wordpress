package pageObject_nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs_nopCommerce.HomePageUI;

public class HomePageObject extends BasePage{
	WebDriver driver;
	
	public HomePageObject (WebDriver driver) {
		this.driver = driver;
	}

	public void ClickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINKTEXT);
		clickToElement(driver, HomePageUI.REGISTER_LINKTEXT);
		
	}

	public boolean isMyAccountLinkDisplayed() {
		waitForElementVisible(driver, HomePageUI.MYACCOUNT_LINKTEXT);
		return isElementDisplayed(driver, HomePageUI.MYACCOUNT_LINKTEXT);
	}

	public void clickToLoginLink() {
		waitForElementClickable(driver, HomePageUI.LOGIN_LINKTEXT);
		clickToElement(driver, HomePageUI.LOGIN_LINKTEXT);
		
	}
}
