package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class TestngLearning  {
	
	@Test (groups= {"smoke Test", "sanity Test"}, expectedExceptions = NoSuchElementException.class)
	@Parameters({"url","emailid"})
	public void parameterTest(String url, String emailid)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(url);
		driver.findElement(By.id("ravi")).click();
		
	}

	
	@Test (expectedExceptions = NoSuchElementException.class)
	@Parameters({"url","emailid"})
	public void twoparameterTest(String url, String emailid)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(url);
		driver.findElement(By.id("ravi")).click();
		
	}
	
	@Test (groups= {"smoke Test"},expectedExceptions = NoSuchElementException.class)
	@Parameters({"url","emailid"})
	public void threeparameterTest(String url, String emailid)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(url);
		driver.findElement(By.id("ravi")).click();
		
	}
	
	@Test (groups= {"sanity Test"},expectedExceptions = NoSuchElementException.class)
	@Parameters({"url","emailid"})
	public void fourparameterTest(String url, String emailid)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(url);
		driver.findElement(By.id("ravi")).click();
		
	}
	
	@Test (expectedExceptions = NoSuchElementException.class)
	@Parameters({"url","emailid"})
	public void fiveparameterTest(String url, String emailid)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(url);
		driver.findElement(By.id("ravi")).click();
		
	}
}
