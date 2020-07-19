package DependsOnGroups;

import org.testng.annotations.Test;

public class TestDependsOnMultipleGroups 
{
	@Test(dependsOnGroups={"first Group","second Group"})
	public void Test1()
	{
		System.out.println("This Method is Dependent on First Group & Second Group");
	}
	@Test(groups={"first Group"})
	public void Test2()
	{
		System.out.println("Test2: This Method belongs to first Group");
	}
	@Test(groups={"second Group"})
	public void Test3()
	{
		System.out.println("Test3: This Method belongs to second Group");
	}
}
