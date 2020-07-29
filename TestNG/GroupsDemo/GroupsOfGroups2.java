package GroupsDemo;

import org.testng.annotations.Test;

public class GroupsOfGroups2 
{
	@Test(groups = { "functionalTest" })
	public void composeMail() 
	{
		System.out.println("Mail Sent");
	}
}
