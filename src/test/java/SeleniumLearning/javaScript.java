package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScript {

	WebDriver driver;
	@Test
	public void jsClick()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/drag_drop.html");

driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		//Element which needs to drag.    		
    	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
     
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//sending values
//		js.executeScript("document.getElementById('some id').value='someValue';");
//		js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");
//		js.executeScript("document.getElementById('email').value='somevalue';");
js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 2px solid red;');", From);
	}
	
}
