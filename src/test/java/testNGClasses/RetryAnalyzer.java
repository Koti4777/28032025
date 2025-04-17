package testNGClasses;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	private  int count =0;
	private final int retrycount =3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		if (count<retrycount) {
			
			count++;
			return true;
		}
		
		return false;
	}

}
