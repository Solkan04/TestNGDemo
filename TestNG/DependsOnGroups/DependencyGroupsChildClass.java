package DependsOnGroups;

import org.testng.annotations.Test;

public class DependencyGroupsChildClass 
{
	@Test(dependsOnGroups={"same class","other class"})
	public void Test1()
	{
		System.out.println("This Method is dependent on same class & other class groups");
	}
	@Test(groups="same class")
	public void Test2()
	{
		System.out.println("This Method belongs to Same Class Group");
	}

}
