package AssertionsDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_WhenAssertFailsWithassertAllMethod 
{
	@Test
	public void softAssert() 
	{
		SoftAssert sa = new SoftAssert();// We need to create an object of SoftAssert class
		System.out.println("softAssert Method Was Started");
		sa.assertTrue(false);// Assert fails here & exception is thrown when we execute & the test is failed
		System.out.println("softAssert Method Was Executed");
		sa.assertAll();//If we forget to call assertAll() at the end of our test, the test will pass
									// even if any assert objects threw exceptions. 
									// the assertAll() will throw any error if any assert fails when we use SoftAssert
	}
}
