package TestNG;
//pull the code
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyzer implements IRetryAnalyzer{

	int counter = 0;
	int retryLimit = 3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(counter<retryLimit)
		{
			counter++;
			return true;
		}
		
		return false;
	}

}
