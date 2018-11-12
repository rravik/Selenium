package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterized {
	
	public static WebDriver driver;
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//driver.close();
	}
//
//	
//	@Test (groups = "regression")
//	@Parameters({"url", "emailid"})
//	public void yahooLoginTest(String url, String emailid)
//	{
//
//		driver.get(url);
//		WebElement email = driver.findElement(By.name("username"));
//		WebElement next = driver.findElement(By.name("signin"));
//		
//		email.clear();
//		email.sendKeys(emailid);
//		next.click();
//		
//	}
//	
//	@Test (dependsOnMethods = {"yahooLoginTest"},  groups = {"login","regression1"}) 
//	public void guruWebsite()
//	{
//		driver.get("file:///C:/Users/Ravi/Downloads/Top%20150%20Software%20Testing%20Interview%20Questions%20&%20Answers.html");
//		Assert.assertTrue(false);
//	}
//	
//	@Test (dependsOnMethods = {"yahooLoginTest"}, groups = {"regression", "unit test"})
//	public void google()
//	{
//		driver.get("https://www.google.com/");
//	}
//	
//	
	@Test (groups = {"regression"})
	public void test1()
	{
		Assert.assertTrue(false);
		
	}
	
@Test	
	public void test2()
	{
		Assert.assertTrue(true);
		
	}

@Test(expectedExceptions=ArithmeticException.class)
public void dividedByZeroExample1(){
	int e = 1/0;

}

@Test()
public void dividedByZeroExample2(){
	int e = 1/0;

	throw new SkipException("Skipping this exception");
}
}
