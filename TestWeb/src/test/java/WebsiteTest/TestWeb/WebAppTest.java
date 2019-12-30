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
		driver.get("http://13.232.188.236:82/devopsIQ/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String appURL = driver.getTitle();
		assertEquals("Jenkins Final Website", appURL);
		System.out.println("Application title: "+appURL);
	}
	
	@After
	public void tearDown()
	{
		EnvSetup.shutDownDriver();
	}
}
