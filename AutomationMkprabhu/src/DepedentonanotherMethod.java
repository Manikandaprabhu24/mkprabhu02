import org.testng.Reporter;
import org.testng.annotations.Test;

public class DepedentonanotherMethod 
{

	@Test(priority=0,invocationCount=2)
	public void Morning()
	{
		Reporter.log("Moring Food",true);
		
	}

	@Test(priority=0,dependsOnMethods="Morning" )
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

