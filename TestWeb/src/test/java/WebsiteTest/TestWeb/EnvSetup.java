package WebsiteTest.TestWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnvSetup {
	
	public static void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "/home/ubuntu/jenkins/workspace/Test/TestWeb/src/test/java/Driver/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-gpu");
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		RunDriver.setDriver(driver);
	}
	
	public static void shutDownDriver()
	{
		RunDriver.getDriver().quit();
	}
}
