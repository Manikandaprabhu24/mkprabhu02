package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationtesNG {
@Test(invocationCount=-3)
public void Mani()
{
	Reporter.log("mkp1",true);
}
@Test(invocationCount=2)
public void Manikanda()
{
	Reporter.log("MKP2",true);
}
@Test(invocationCount=4)
public void Prabhu()
{
	Reporter.log("MKP3",true);
}
}
