package pageObject_nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs_nopCommerce.HomePageUI;

public class HomePageObject extends BasePage{
	WebDriver driver;
	//PageGeneratorManager pageGenerator;
	
	public HomePageObject (WebDriver driver) {
		this.driver = driver;
		//pageGenerator = PageGeneratorManager.getPageGenerator();
	}

	public RegisterPageObject ClickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINKTEXT);
		clickToElement(driver, HomePageUI.REGISTER_LINKTEXT);
		return PageGeneratorManager.getRegisterPage(driver);
	}

	public boolean isMyAccountLinkDisplayed() {
		waitForElementVisible(driver, HomePageUI.MYACCOUNT_LINKTEXT);
		return isElementDisplayed(driver, HomePageUI.MYACCOUNT_LINKTEXT);
	}

	public LoginPageObject clickToLoginLink() {
		waitForElementClickable(driver, HomePageUI.LOGIN_LINKTEXT);
		clickToElement(driver, HomePageUI.LOGIN_LINKTEXT);
		return PageGeneratorManager.getLoginPage(driver);
	}

	public MyAccountPageObject clickToMyAccountLink() {
		waitForElementClickable(driver, HomePageUI.MYACCOUNT_LINKTEXT);
		clickToElement(driver, HomePageUI.MYACCOUNT_LINKTEXT);
		return PageGeneratorManager.getMyAccountPage(driver);
	}
}
