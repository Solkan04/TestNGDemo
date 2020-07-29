package DependsOnMethods;

import org.testng.annotations.Test;
//Execute DependencyMethodsChildClass
public class DependencyMethodsParentClass 
{
	@Test
	public void ParentTest()
	{
		System.out.println("This is Base for Child Class Method");
	}
}
