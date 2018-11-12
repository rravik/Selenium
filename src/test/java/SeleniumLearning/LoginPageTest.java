package SeleniumLearning;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestBase.baseClass;
import TestPage.LoginPage;
import TestPage.searchPage;

public class LoginPageTest extends baseClass {

	LoginPage loginPage;
	searchPage searchpage;

	public ExtentReports extent;
	public ExtentTest logger;

	public LoginPageTest() {
		super();
	}

	@BeforeTest()
	public void setExtent() {
		extent = new ExtentReports(System.getProperty("user.dir") + "//test-output//ExtentReport.html", true);
		extent.addSystemInfo("Host Name", "Ravi Windows");
		extent.addSystemInfo("User Name", "Ravi Kumar");
		extent.addSystemInfo("Environment", "QA");
	}

	@AfterTest
	public void endReport() {

		extent.flush();
		extent.close();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();

	}

	@Test
	public void loginPageTitleTest() {

		String title = loginPage.validatePageTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service2");

	}

	@Test
	public void loginTest() {

		logger = extent.startTest("loginTest");
		searchpage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName());
			logger.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());

			String screenshotPath = getScreenshot(driver, result.getName());
			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			logger.log(LogStatus.SKIP, "TEST CASE SKIPPED IS " + result.getName());
			
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(LogStatus.PASS, "TEST CASE PASS IS " + result.getName());
			
		}
		extent.endTest(logger);
	}
}
