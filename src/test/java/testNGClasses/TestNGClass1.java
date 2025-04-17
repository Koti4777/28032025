package testNGClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGClass1 {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public static void test1Class1() {
		
		Assert.assertEquals(false, true);
	
	}
	
	@Test
	public static void test2Class1() {
		
		Assert.assertEquals(true, false);
	
	}

}
