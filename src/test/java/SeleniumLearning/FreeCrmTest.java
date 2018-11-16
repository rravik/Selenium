package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FreeCrmTest {

	public String credentials;
	public String credentialsInfo[];
	
	@Test
	public void loginWithAdminUser()
	{
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://www.freecrm.com/");
		 
		 credentials = hashMapData.getUserLoginInfo().get("admin");
		 credentialsInfo = credentials.split("_");
		 
		 WebElement username = driver.findElement(By.name("username"));
		 WebElement password = driver.findElement(By.name("password"));
		 WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		 
		 username.sendKeys(credentialsInfo[0]);
		 password.sendKeys(credentialsInfo[1]);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginBtn);
		
	}
	
	
	public void loginWithCustomerUser() {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://www.freecrm.com/");
		 
		 credentials = hashMapData.getUserLoginInfo().get("customer");
		 credentialsInfo = credentials.split("_");
		 
		 WebElement username = driver.findElement(By.name("username"));
		 WebElement password = driver.findElement(By.name("password"));
		 WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		 
		 username.sendKeys(credentialsInfo[0]);
		 password.sendKeys(credentialsInfo[1]);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginBtn);
	}
	

}
