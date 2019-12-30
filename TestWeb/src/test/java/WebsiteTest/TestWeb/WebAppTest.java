package WebsiteTest.TestWeb;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class WebAppTest {

	@Before
	public void startBrowser()
	{
		EnvSetup.initDriver();
	}
	
	@Test
	public void testApp()
	{
		WebDriver driver = RunDriver.getDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String appURL = driver.getTitle();
//		assertEquals("Jenkins Final Website", appURL);
		System.out.println("Application is up");
		assertEquals("Google", appURL);
	}
	
	@After
	public void tearDown()
	{
		EnvSetup.shutDownDriver();
	}
}
