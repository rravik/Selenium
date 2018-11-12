package SeleniumLearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class robotClassTest {

	public static WebDriver driver;
	//public static Robot robot;
	
	@BeforeMethod
	public void settUp() throws AWTException
	{
		
		System.setProperty("webdriver.chrome.driver",	 "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 
	}
	
	@Test
	public void fileUpload() throws AWTException
	{
		Robot robot = new Robot();
		
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		WebElement upload = driver.findElement(By.id("imagesrc"));
		upload.click();
		
		String filepath = "C:\\Users\\Ravi\\Desktop\\asd.txt";
		
		//copy the text file (control c)
		StringSelection stringselection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		
		//wait for 2 seconds
		robot.setAutoDelay(5000);
		
		//control v (paste the path)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		//wait for 2 seconds
		robot.setAutoDelay(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
