package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
//@Listeners(com.actitime.generic.ListenerImplmentation.class)
public class CustomerModules extends BaseClass 
{
@Test(groups= {"smokeTest","RegressionTest"})
public void creatCutsomer()
{
//Assert.fail();
	Reporter.log("createCustomer",true);
}
@Test(groups="Regressiontest",dependsOnMethods="CreateCustomer")
public void modifyCustomer() 
{
	Reporter.log("modifyCustomer",true);
}
@Test(groups="regressionTest")
public void deleteCustomer()
{
    Reporter.log("deleteCustomer",true);
}
}
