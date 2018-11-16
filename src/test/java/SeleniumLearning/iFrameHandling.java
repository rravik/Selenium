package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iFrameHandling {
	public static WebDriver driver;

	public static void disableNotification() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	}

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void defaultContent() {
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		//find the frame1 and store it in webelement
		WebElement frame1 = driver.findElement(By.id("frame1"));
		// switch to frame1
		driver.switchTo().frame(frame1);
		// find the frame 3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		// switch to frame 3
		driver.switchTo().frame(frame3);
		// find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		// if check box is not selected then click the checkbox
		if(! checkbox.isSelected()){
			checkbox.click();
		}
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement dropdown = driver.findElement(By.id("animals"));
		
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Avatar");
		
		
	}
	
	
	public void ParentFrame()
	{
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		//find the frame1 and store it in webelement
		WebElement frame1 = driver.findElement(By.id("frame1"));
		// switch to frame1
		driver.switchTo().frame(frame1);
		// find the frame 3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		// switch to frame 3
		driver.switchTo().frame(frame3);
		// find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		// if check box is not selected then click the checkbox
		if(! checkbox.isSelected()){
			checkbox.click();
		}
		// navigate to parent frame, which is frame 1
		driver.switchTo().parentFrame();
		// set the value of the textbar to the value stored
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		// navigate to parent, which is page
		driver.switchTo().parentFrame();
		// store the text value
		String textValue = driver.findElement(By.xpath("//label/span")).getText();
		//verify the value matches or not
		if(textValue.equals("selenium webdriver")){
			System.out.println("Topic value is equal to 'selenium webdriver'");
		}
	}
	
	
	public void NestedFrame()
	{
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		disableNotification();

		WebElement frame1 = driver.findElement(By.id("frame1"));
		
		
		driver.switchTo().frame(frame1);
		
		WebElement frame3 = driver.findElement(By.id("frame3"));
		driver.switchTo().frame(frame3);
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@type='checkbox']"));
		checkBox.click();
		
	}
	
	public void FramesInWebdriver () {
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		disableNotification();

		// Handling the three frames
		WebElement frame1 = driver.findElement(By.id("frame1"));

		// store the text value
		String textValue = driver.findElement(By.xpath("//label/span")).getText();
		// switch to frame1
		driver.switchTo().frame(frame1);
		// set the value of the textbar to the value stored
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textValue);

	}
	
	

}
