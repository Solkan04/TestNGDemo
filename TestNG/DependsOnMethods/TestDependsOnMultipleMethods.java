package DependsOnMethods;

import org.testng.annotations.Test;

public class TestDependsOnMultipleMethods 
{
	@Test(dependsOnMethods={"Test3","Test2"})
	public void Test1()
	{
		System.out.println("This Method is dependent on Test3 & Test2");
	}
	@Test
	public void Test2()
	{
		System.out.println("This is actual test method");
	}
	@Test
	public void Test3()
	{
		System.out.println("This Method is Base for Test1");
	}
}
