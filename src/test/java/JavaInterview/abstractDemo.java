package JavaInterview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class abstractDemo {
	
	public void mymethod()
	{
		System.out.println("Hello");
	}

	   abstract public void anotherMethod();
	   
	   abstract public void anotherMethod1();
	   
	   abstract public void absandint();
	   
	   
	   public static void main (String[] args) throws IOException
	   {
		   System.out.println("abstract");
		   
		   WebDriver driver = new ChromeDriver();
		   TakesScreenshot tks = (TakesScreenshot) driver;
		   
		   File file = tks.getScreenshotAs(OutputType.FILE);
		   
		   FileUtils.copyFile(file, new File (""));
	   }

}
