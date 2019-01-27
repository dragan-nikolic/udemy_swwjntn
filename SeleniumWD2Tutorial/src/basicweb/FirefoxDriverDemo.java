package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		System.setProperty(
				"webdriver.gecko.driver", 
				"/Users/Downloads/geckodriver⁩");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.google.com";
		
		driver.get(baseUrl);
	}

}
