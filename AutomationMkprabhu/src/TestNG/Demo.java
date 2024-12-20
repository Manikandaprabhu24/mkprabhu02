package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test	
public void DemoA()
{
Reporter.log("Hello world");	
}
@Test
public void demoB()
{
	Reporter.log("Wecome to world",false);
	
}
@Test
public void demoC()
{
	System.out.println("world la onnum illa");
}
}
