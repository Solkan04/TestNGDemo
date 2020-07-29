package GroupsDemo;

import org.testng.annotations.Test;

public class GroupsOfGroups1 
{
	@Test(groups = {"smokeTest", "functionalTest"})
	public void loginTest() 
	{
		System.out.println("Logged in successfully");
	}
}
