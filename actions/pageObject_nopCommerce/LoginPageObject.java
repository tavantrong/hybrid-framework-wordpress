package pageObject_nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs_nopCommerce.LoginPageUI;

public class LoginPageObject extends BasePage{
		WebDriver driver;
		
		public LoginPageObject (WebDriver driver) {
			this.driver = driver;
		}


		public void enterToEmailTextbox(String emailTextbox) {
			waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
			sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailTextbox);
			
		}

		public void enterToPasswordTextbox(String password) {
			waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
			sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
			
		}

		public void clickToLoginButton() {
			waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
			clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
			
		}
	}

