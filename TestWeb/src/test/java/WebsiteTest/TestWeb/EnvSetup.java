package WebsiteTest.TestWeb;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnvSetup {
	
	public static void initDriver()
	{
		File file = new File("/home/ubuntu/jenkins/workspace/Test/TestWeb/src/test/java/Driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-gpu");
		options.addArguments("--headless");
		options.setBinary("/home/ubuntu/jenkins/workspace/Test/TestWeb/src/test/java/Driver/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		RunDriver.setDriver(driver);
	}
	
	public static void shutDownDriver()
	{
		RunDriver.getDriver().quit();
	}
}
