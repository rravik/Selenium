package SeleniumLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel {

	WebDriver driver;

	@Test
	public void HandlingExcelSheet() throws IOException {
		
		File file = new File("E:\\Selenium\\Selenium\\TestData.xlsx");
		FileInputStream objfile = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(objfile);
		Sheet objsheet = wb.getSheet("TestData");
		
		int rows = objsheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		
		
		for(int i=1; i<rows; i++)
		{
			int cols = objsheet.getRow(0).getLastCellNum();
			
			for(int j=0; j<cols; j++)
			{
				
				Cell cell1 = objsheet.getRow(i).getCell(j);
				cell1.setCellType(CellType.STRING);
				
				System.out.println(cell1.getRichStringCellValue().toString());
			}
		}
		
	}
	
	public void guruTest() throws IOException {

		// Create an object of ReadGuru99ExcelFile class

		Excel objExcelFile = new Excel();

		// Prepare the path of excel file

		String filePath = "E:\\Selenium\\Selenium\\";

		// Call read file method of the class to read data

		objExcelFile.readExcel(filePath, "TestData.xlsx", "TestData");

	}

	
	public void extractfromExcel() throws IOException {

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

		int rowCount = guruSheet.getLastRowNum() - guruSheet.getFirstRowNum();

		for (int i = 1; i < rowCount + 1; i++) {

			Row row = guruSheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum() - 1; j++) {
				/*
				 * if(row.getCell(3).getStringCellValue().equals("Yes")) {
				 * 
				 * }
				 */
				System.out.print(row.getCell(j).getStringCellValue() + "||");

				String emailText = row.getCell(0).getStringCellValue();
				String passText = row.getCell(1).getStringCellValue();
				String CpassText = row.getCell(2).getStringCellValue();
				

				System.out.println(emailText + " || " + passText + " || " + CpassText + " || ");

				email.sendKeys(emailText);
				password.sendKeys(passText);
				confirmPassword.sendKeys(CpassText);
				email.clear();
				password.clear();
				confirmPassword.clear();

			}

			System.out.println();
		}

	}

	public void readExcel(String filePath, String fileName, String sheetName) throws IOException {

		// Create an object of File class to open xlsx file

		File file = new File(filePath + "\\" + fileName);

		// Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook guru99Workbook = null;

		// Find the file extension by splitting file name in substring and getting only
		// extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		// Check condition if the file is xlsx file

		if (fileExtensionName.equals(".xlsx")) {

			// If it is xlsx file then create object of XSSFWorkbook class

			guru99Workbook = new XSSFWorkbook(inputStream);

		}

		// Check condition if the file is xls file

		else if (fileExtensionName.equals(".xls")) {

			// If it is xls file then create object of XSSFWorkbook class

			guru99Workbook = new HSSFWorkbook(inputStream);

		}

		// Read sheet inside the workbook by its name

		Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

		// Find number of rows in excel file

		int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();

		// Create a loop over all the rows of excel file to read it

		for (int i = 0; i < rowCount + 1; i++) {

			Row row = guru99Sheet.getRow(i);

			// Create a loop to print cell values in a row

			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Print Excel data in console

				System.out.print(row.getCell(j).getStringCellValue() + "|| ");

			}

			System.out.println();

		}

	}

}
