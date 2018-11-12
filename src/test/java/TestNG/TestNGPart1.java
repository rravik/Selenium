package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPart1 {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("-- before class--");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("-- before suite--");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("-- before test--");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("-- after test--");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("-- after class--");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("-- after suite--");
	}
	
	
	@Test
	public void yahooLoginTest()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Ravi/Downloads/Yahoo%20-%C2%A0login.html");
		WebElement email = driver.findElement(By.name("username"));
		WebElement next = driver.findElement(By.name("signin"));
		
		email.clear();
		email.sendKeys("test@yahoo.com");
		next.click();
	}
	
	
}
