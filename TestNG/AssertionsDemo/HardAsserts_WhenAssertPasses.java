package AssertionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserts_WhenAssertPasses 
{
	@Test
	public void hardAssert() 
	{
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(true);//assertion error will not be thrown here
		System.out.println("hardAssert Method Was Executed");//this statement is executed
	}
}
