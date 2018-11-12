package JavaLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaInterviewQuestions {

	// System.setProperty("webdriver.chrome.driver",
	// "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
	// WebDriver driver = new ChromeDriver();
	// driver.get("http://www.google.com");
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//
	// WebDriverWait wait = new WebDriverWait(driver, 10);
	// wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));

	@Test
public void sample()
{
		
		int i=1;
		while (i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		
		int a=10;
		do {
			
			System.out.println("i am executing "+a);
			} while(a<10);
		}

	
	public void nestedif()
	{
		
		int x =10;
		int y = 20;
		
		if(x==30)
		{
			if(y==10)
			{
				System.out.println("x = 30 and y = 10" );
			}
		}
		
	}
	
	public void fibonical() {

		int a = 0;
		int b = 1;
		long c = 65;

		int d;
		System.out.println(a + " " + b);

		for (int i = 2; i < c; i++) {
			int f = a + b;// 1 1+1=2; 2+1=3;
			a = b;// 1 1 2
			b = f;// 1 2 3

		}
	}

	public void reverseString() {

		String pName = "Selenium Project";
		String reverse = "";
		int length = pName.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + pName.charAt(i);
		}

		System.out.print(reverse);
		System.out.println();
	}

}