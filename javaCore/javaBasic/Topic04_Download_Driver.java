package javaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Topic04_Download_Driver {

	public static void main(String[] args) {
		WebDriver driver;
		
		// Auto download và setup driver
		// WebDriverManager là thư viên riêng download ngoài và add vào
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().driverVersion("109.0.5414.76").setup();
		// = System.setProperty("webdriver.gecko.driver", ".\\browserDriver\\geckodriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
	}

}
