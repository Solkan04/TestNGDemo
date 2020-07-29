package AssertionsDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts_WhenAssertFails 
{
	@Test
	public void softAssert() 
	{
		SoftAssert softAssertion = new SoftAssert();//We need to create an object of SoftAssert class
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);//Assert fails here but exception is not thrown when we execute & the test is passed
		System.out.println("softAssert Method Was Executed");// this statement is also executed
	}
}
