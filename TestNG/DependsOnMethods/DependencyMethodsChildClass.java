package DependsOnMethods;

import org.testng.annotations.Test;

public class DependencyMethodsChildClass extends DependencyMethodsParentClass
{
	@Test(dependsOnMethods="ParentTest")
	public void ChildTest1()
	{
		System.out.println("This Method is dependent on Parent Method");
	}
	
	@Test
	public void ChildTest2()
	{
		System.out.println("This is a Normal Method");
	}
}
