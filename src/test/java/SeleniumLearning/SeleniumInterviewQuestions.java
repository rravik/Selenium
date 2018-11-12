package SeleniumLearning;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestBase.baseClass;

public class SeleniumInterviewQuestions extends baseClass {




//	WebDriver driver;

	@Test
	
	public void doubleClick()
	{
		
		initialization();
		WebElement userName = driver.findElement(By.name("username"));
		
		Actions action = new Actions(driver);
		action.doubleClick(userName);
	}
	
	@Test
	public void highlightElementTest()
	{
		
		
		initialization();
		WebElement userName = driver.findElement(By.name("username"));
		
		highlightElement(userName);
		
		WebElement Password = driver.findElement(By.name("password"));
		
		highlightElement(Password);
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		
		highlightElement(loginBtn);
		userName.sendKeys("naveenk");
		Password.sendKeys("test@123");
		loginBtn.click();
	}
	
	
	public void googlePage()
	{
	
		
		initialization();
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	public void brokeLinksImages() throws InterruptedException, MalformedURLException, IOException
	{
		
		
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.lifewire.com/404-not-found-error-explained-2622936");
		
//		driver.findElement(By.name("username")).sendKeys("naveenk");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.switchTo().frame("mainpanel");
		
		//1. get all the links
List<WebElement>	linklist =	driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		
		
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for (int i=0; i<linklist.size(); i++)
		{
			//System.out.println("Linklist link count is "+linklist.size());
			if(linklist.get(i).getAttribute("href") != null && (!linklist.get(i).getAttribute("href").contains("javascript")))
			{
				
				activeLinks.add(linklist.get(i));
			}
		
		
		}
		System.out.println("activeLinks link count is "+activeLinks.size());
		
		

		
		
		
		for(int j=0; j<activeLinks.size(); j++)
		{
			
		HttpURLConnection conn =	(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		conn.connect();
		String response = conn.getResponseMessage();
		
		conn.disconnect();
		
		if(!response.equals("OK")) {
			
		
		System.out.println(activeLinks.get(j).getAttribute("href")+"-----> "+response);
		}	
		}
		
	}
	
	public void doubleclick()
	{
	
		
		
		FirefoxBinary binary = new FirefoxBinary();
		binary.addCommandLineOptions("--headless");
		
		FirefoxOptions foption = new FirefoxOptions();
		foption.setBinary(binary);
		
		driver = new FirefoxDriver(foption);
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	
		
		driver.get("http://api.jquery.com/dblclick/");		
		driver.switchTo().frame(0);
        //Create the object 'action'		
Actions action = new Actions(driver);
//Find the targeted element
WebElement ele = driver.findElement(By.cssSelector("html>body>div"));
        //Here I used JavascriptExecutor interface to scroll down to the targeted element
JavascriptExecutor js =  (JavascriptExecutor) driver;

js.executeScript("arguments[0].scrollIntoView();", ele);
        //used doubleClick(element) method to do double click action
action.doubleClick(ele).build().perform();


	}
	
	public void ReadpropFile() throws IOException {

		Properties prop = new Properties();
		FileInputStream fip = new FileInputStream("E:\\Selenium\\Selenium\\object.properties");
		prop.load(fip);

		
		String name = prop.getProperty("name");
		System.out.println(name);
		
		System.out.println("Open\nexit");
	}

	

	
	public void authenticationPopup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.get("https://www.engprod-charter.net/");
		Runtime.getRuntime().exec("C:\\Users\\Ravi\\Desktop\\aUTOid\\AuthenticationPopup.exe");

		
		FirefoxBinary fb = new FirefoxBinary();
		fb.addCommandLineOptions("--headless");
		
		FirefoxOptions ff = new FirefoxOptions();
		ff.setBinary(fb);
		
		
		
		
		
		
	}
	
	public void zoomandzoomout() throws AWTException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		
		Robot robot = new Robot();
		
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		for(int i=0; i<3; i++)
		{
			//driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SHIFT, Keys.SUBTRACT));
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_ADD);
			
			
			
		}
		
		
	}
	
	
	public void click10thImage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://stackoverflow.com/questions/21552928/webdriver-click-second-element-in-list");

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		for (int i = 0; i < images.size(); i++) {
			if (images.get(i).equals(2)) {
				images.get(i).click();

			}
		}

	}

	public void sample() {
		System.out.println("user directory is " + System.getProperty("user.dir"));
	}


	public void telegram() throws IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:\\www.google.com");
		// takeScreenshot("firstScreenshot");

		// TakesScreenshot tks = ((TakesScreenshot)driver);
		// File src = tks.getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, new
		// File("E:\\Selenium\\Selenium\\src\\main\\java\\Screenshots\\first.jpg"));
		//


		String mainWindow = driver.getWindowHandle();
		
		Set<String> handle = driver.getWindowHandles();

		Iterator<String> it = handle.iterator();
		
		while(it.hasNext())
		{
			handle.iterator();
			if(driver.getTitle().equals(""))
			{
				
			}
		}
		
	}

}
