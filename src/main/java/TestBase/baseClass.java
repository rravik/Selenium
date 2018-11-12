package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;


public class baseClass {
	
	int i;
	static int j;
	public static int k;
	
	
	
	public static WebDriver driver;
	public static String browser;
	public static Properties prop;
	public baseClass() 
	{
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("E:\\Selenium\\Selenium\\object.properties");
			prop.load(fis);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void initialization()
	{
		browser = prop.getProperty("browser");
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

		
		driver.get(prop.getProperty("url"));
		
	}
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		String dateName = new SimpleDateFormat("yyyy-mm-dd").format(new Date());
		TakesScreenshot tks = ((TakesScreenshot)driver);
		File src = tks.getScreenshotAs(OutputType.FILE);
		
		String destination = 	System.getProperty("user.dir")+"//FailedTestScreenshots//" + screenshotName+dateName+".png";
		File fileDestination = new File(destination);
		FileUtils.copyFile(src, fileDestination);
		
		return destination;
	}
	
	
	
	public static void takeScreenshot(String fileName) throws IOException
	{
		TakesScreenshot tks = ((TakesScreenshot)driver);
		File src = tks.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Selenium\\Selenium\\src\\main\\java\\Screenshots\\"+fileName+".jpg"));
	}

	
	public  void failedTestcase(String testMethodName)
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("E:\\Selenium\\Selenium\\src\\main\\java\\Screenshots\\failShot_"+testMethodName +".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void highlightElement(WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
		//arguments[0].stype-border='3px solid red'
		
	}
}
