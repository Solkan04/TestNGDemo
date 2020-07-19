package Parameterization;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameterization 
{
	@Parameters({"optional-value"})
	@Test
	public void optionalTesting(@Optional("Default parameter will execute if parameter tag misses in the testng.xml file")String param)
	{
		System.out.println(param);
	}
}
