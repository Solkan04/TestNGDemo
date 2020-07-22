package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestOverridingSuite 
{
	@Parameters({"suite-level-param", "test-level-param1"})
	@Test
	public void thirdTest(String suiteparam, String testparam)
	{
		System.out.println(suiteparam+"****"+testparam);
	}
}
