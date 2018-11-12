package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writeToExcel {
	
	public static void main (String [] args)
	{
		
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String beforeXpath = "//table[@id='customers']//tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=2; i<=7; i++)
		{
			
			String actualXpath = beforeXpath+i+afterXpath;
			
		}
		
		
	}

}
