package DependsOnGroups;

import org.testng.annotations.Test;
//Execute DependencyGroupsChildClass
public class DependencyGroupsParentClass 
{
	@Test(groups={"other class"})
	public void Test3()
	{
		System.out.println("This Method belongs to other class group");
	}
}
