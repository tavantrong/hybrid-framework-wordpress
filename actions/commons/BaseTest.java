package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;
	String projectLocator = System.getProperty("user.dir");
	
	
	protected WebDriver getBrowserDriver (String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.getProperty("webdriver.gecko.driver", projectLocator + "\\browserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.getProperty("webdriver.chrome.driver", projectLocator + "\\browserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge_chromium")) {
			System.getProperty("webdriver.edge.driver", projectLocator + "\\browserDriver\\msedgedriver.exe");
			driver = new EdgeDriver();			
		}  else {
			throw new RuntimeException("Please input the browser name!");
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}


	public int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(99999);
	}
}
