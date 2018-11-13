package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTesting {

	WebDriver driver;
	@BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}
	
	@Test
	public void prompalert() throws InterruptedException
	{
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(3000);
		Alert ale = driver.switchTo().alert();
		ale.sendKeys("chercher.tech");
	}
	
}
