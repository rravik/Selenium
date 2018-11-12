package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver;	
	@Test
	@Parameters("browser")
public void crossbrowserTesting(String browser)
{
	
//String browser = "chrome";

	
if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		else if(browser.equals("firefox")) {
			
		System.setProperty("webdriver.gecko.driver",	 "E:\\Selenium\\Selenium\\drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		}


driver.get("http://www.google.com");
	
}
	
	@Test
	public void crossbrowserTesting1(String browser)
	{
		
	//String browser = "chrome";

		
	if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}

			else if(browser.equals("firefox")) {
				
			System.setProperty("webdriver.gecko.driver",	 "E:\\Selenium\\Selenium\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 
			}


	driver.get("http://www.yahoo.com");
		
	}

	
	@Test
	public void crossbrowserTesting2(String browser)
	{
		
	//String browser = "chrome";

		
	if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}

			else if(browser.equals("firefox")) {
				
			System.setProperty("webdriver.gecko.driver",	 "E:\\Selenium\\Selenium\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 
			}


	driver.get("http://www.rediffmail.com");
		
	}
	@Test
	public void crossbrowserTesting3(String browser)
	{
		
	//String browser = "chrome";

		
	if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}

			else if(browser.equals("firefox")) {
				
			System.setProperty("webdriver.gecko.driver",	 "E:\\Selenium\\Selenium\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 
			}


	driver.get("http://www.youtube.com");
		
	}

	
}
