package SeleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class softwareTestingo {

	WebDriver driver;
	
	public void extractQuestions()
	{
		Long time = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.softwaretestingo.com/accenture-selenium-interview-faq/");

		List<WebElement> questionsList = driver.findElements(By.xpath("//li[@dir='ltr']"));
		
		for(WebElement printquestionsList : questionsList)
		{
			
			System.out.println(printquestionsList.getText());
			
		}
		
	}
	
	@Test
	public void training()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html?e=2");
		
		WebElement text = driver.findElement(By.linkText("Features"));
		
		
		Actions action = new Actions(driver);
		
		text.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		text.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();

		
		
		
		//System.out.println(text.getText());
	}
	
	
	
}
