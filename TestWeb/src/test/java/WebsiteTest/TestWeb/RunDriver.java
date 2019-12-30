package WebsiteTest.TestWeb;

import org.openqa.selenium.WebDriver;

public class RunDriver {
	public static WebDriver driver=null;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		RunDriver.driver = driver;
	}
}
