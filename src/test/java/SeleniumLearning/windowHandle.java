package SeleniumLearning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	static WebDriver driver;
	public static void main (String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 
		 
		 
		 WebElement popup2 = driver.findElement(By.xpath("//button[text()='New Message Window']"));
		 WebElement popup4 = driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
		 
		 
		 popup2.click();
		 popup4.click();
		 
		 Set<String> handle =  driver.getWindowHandles();
		 
		 System.out.println("windows list: "+handle);
		 Iterator<String> handles = handle.iterator();
		 
		 while(handles.hasNext())
		 {
			 String childWindow = handles.next();
			 
			 driver.switchTo().window(childWindow); 
		
			 System.out.println(driver.getTitle());
			 if(driver.getTitle().equals(""))
			 {
		
				 driver.close();
			 }
			 
		 }
		 
		 
		driver.close();
	}
	
}
