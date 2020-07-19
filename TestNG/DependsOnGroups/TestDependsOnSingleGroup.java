package DependsOnGroups;

import org.testng.annotations.Test;

public class TestDependsOnSingleGroup 
{
	@Test(dependsOnGroups="Single Group")
	public void Test1()
	{
		System.out.println("This Method is Dependent on Single Group");
	}
	@Test(groups="Single Group")
	public void Test2()
	{
		System.out.println("Test2: This Method belongs to Single Group");
	}
	@Test(groups="Single Group")
	public void Test3()
	{
		System.out.println("Test3: This Method belongs to Single Group");
	}
}
