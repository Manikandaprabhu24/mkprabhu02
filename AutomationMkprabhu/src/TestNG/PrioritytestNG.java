package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrioritytestNG {
	@Test(priority=-3)
	public void Morning()
	{
		Reporter.log("Moring Food",true);
		
	}

	@Test(priority=1)
	public void Evening()
	{
		Reporter.log("Evening Food",true);
	}
	@Test(priority=2)
	public void Night()
	{
		Reporter.log("Night Food",false);
	}
}
