package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "C:\Users\chanrm\Downloads\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
