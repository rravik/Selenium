package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.baseClass;

public class captureSelectedvalue extends baseClass {
	
	@BeforeClass
	public void setUp()
	{
		initialization();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	@BeforeMethod
	public void open()
	{
		driver.get("https://contactform7.com/checkboxes-radio-buttons-and-menus/");
	}
	
	

	@Test
	public void test()
	{
		
		
		
		List<WebElement> chkbox =  driver.findElements(By.xpath("//input[@name='your-sports']"));
		
		List<WebElement> textbox = driver.findElements(By.xpath("//span[@class='wpcf7-list-item-label']"));
		
		
		for(int i=0; i<textbox.size(); i++)
		{
			
			textbox.get(i).getAttribute("innerHTML");
		}
		
		System.out.println(chkbox.size());
		
		
		
	}
	

	@Test
	public void tes1t()
	{
		
		
		
		List<WebElement> chkbox =  driver.findElements(By.xpath("//input[@name='your-sports']"));
		
		
		System.out.println(chkbox.size());
		
		
		
	}


}
