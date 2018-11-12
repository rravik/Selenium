package SeleniumLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excel {
	
	WebDriver driver;
	@Test
	
		
	public void extractfromExcel() throws IOException
	{
		
		
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium\\drivers\\chromedriver.exe");

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("http://menuar.net/Register");
	
	WebElement email = driver.findElement(By.name("Email"));
	WebElement password = driver.findElement(By.name("Password"));	
	WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
	
	File file = new File("E:\\Selenium\\Selenium\\TestData.xlsx");
	FileInputStream inputStream = new FileInputStream(file);
	Workbook guruWorkbook = new XSSFWorkbook(inputStream);
	Sheet guruSheet = guruWorkbook.getSheet("TestData");
	
	int rowCount = guruSheet.getLastRowNum()-guruSheet.getFirstRowNum();
	
	for(int i=1; i<rowCount+1; i++)
	{
		
		Row row = guruSheet.getRow(i);
		
		for(int j=0; j<row.getLastCellNum(); j++)
		{
			
			System.out.println(row.getCell(j).getStringCellValue());
			email.sendKeys(row.getCell(j).getStringCellValue());
			password.sendKeys(row.getCell(j).getStringCellValue());
			confirmPassword.sendKeys(row.getCell(j).getStringCellValue());
			email.clear();
			password.clear();
			confirmPassword.clear();
		}
		
		
	}
	
	
	
	
		
	}
	
	
		    

}
