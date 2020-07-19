package DependsOnMethods;

import org.testng.annotations.Test;

public class TestDependsOnSingleMethod 
{
	@Test
	public void Test1()
	{
		System.out.println("This Method is Base for Test2");
	}
	@Test(dependsOnMethods="Test1")
	public void Test2()
	{
		System.out.println("This Method is dependent on Test1");
	}
}
