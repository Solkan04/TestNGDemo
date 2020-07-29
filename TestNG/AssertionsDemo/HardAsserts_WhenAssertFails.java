package AssertionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserts_WhenAssertFails 
{
	@Test
	public void hardAssert() 
	{
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);//assertion error will be thrown here
		System.out.println("hardAssert Method Was Executed");//this statement is aborted
	}
}
