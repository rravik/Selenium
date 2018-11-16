package SeleniumLearning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridSetupTest {

	
	public static void main (String[] args) throws MalformedURLException
	{
		//1. define desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		DesiredCapabilities cap1 = DesiredCapabilities.chrome();
		cap.setBrowserName("browser");
		cap.setPlatform(Platform.WIN10);
		
		//2. chrome Options definition
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://192.168.43.155:4444/wd/hub";
		
		WebDriver driver  = new RemoteWebDriver(new URL(hubUrl), cap);
		driver.get("http://api.jquery.com/dblclick/");
		System.out.println(driver.getTitle());
		
		
		
		
	}
}
