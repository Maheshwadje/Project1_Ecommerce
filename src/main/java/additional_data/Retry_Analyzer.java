package additional_data;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer
{
	int initialCount = 0;
	int retryCount = 3;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		
		if(initialCount < retryCount) {
			initialCount++;
			return true;
		}
		
		return false;
	}
	
	
}
