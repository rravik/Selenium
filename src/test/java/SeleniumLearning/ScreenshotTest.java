package SeleniumLearning;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import TestBase.CustomListener;
import TestBase.baseClass;


@Listeners(CustomListener.class)
public class ScreenshotTest extends baseClass {

	@BeforeMethod
	public void setUp()
	{
		initialization();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	@Test
	public void test()
	{
		
		Assert.assertEquals(true, false);
	}
}
