package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikuli {
WebDriver driver;
	
	public void sikulitest()
	{
		
		
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.lifewire.com/404-not-found-error-explained-2622936");

		Pattern pat = new Pattern();
		Screen scr = new Screen();
		
	}
}
