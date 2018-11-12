package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {
	
	WebDriver driver;

	@Test
	
	
	public void dragExample1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		
		
		//Element which needs to drag.    		
    	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
     
     //Element on which need to drop.		
     WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
		
     Actions action = new Actions(driver);
   //  action.dragAndDrop(From, To).build().perform();
     //OR
        action.clickAndHold(From).moveToElement(To).release().build().perform();
        
     
     
	}
	
}
