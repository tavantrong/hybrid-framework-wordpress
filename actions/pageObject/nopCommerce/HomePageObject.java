package pageObject.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.HomePageUI;

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

	public void isRegisterLinkUndisplayed() {
		waitForElementInvisible(driver, HomePageUI.REGISTER_LINKTEXT);
		isElementUndisplayed(driver, HomePageUI.REGISTER_LINKTEXT);
	}

	public void isLoginLinkUndisplayed() {
		waitForElementInvisible(driver, HomePageUI.LOGIN_LINKTEXT);
		isElementUndisplayed(driver, HomePageUI.LOGIN_LINKTEXT);
		
	}

	public void isShoppingCartNoItemTooltopUndisplayed() {
		waitForElementInvisible(driver, HomePageUI.SHOPPING_CART_NOITEM_TOOLTIP);
		isElementUndisplayed(driver, HomePageUI.SHOPPING_CART_NOITEM_TOOLTIP);
		
	}
}
