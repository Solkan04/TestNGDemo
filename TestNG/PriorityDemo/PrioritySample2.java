package PriorityDemo;

import org.testng.annotations.Test;

//What is the execution flow of the methods
public class PrioritySample2 
{
	@Test(priority=-1)
	public void yashwanth()///Will execute first
	{
		System.out.println("This method belongs to Yashwanth");
	}
	
	@Test
	public void naveen()//will execute last
	{
		System.out.println("This method belongs to Naveen");
	}
	
	@Test(priority=0)
	public void mahesh()//will execute second
	{
		System.out.println("This method belongs to Mahesh");
	}
}
