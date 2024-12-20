package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModel {
@BeforeClass
public void openBrowser()
{
 Reporter.log("openBroswer",true);	
}
@BeforeMethod
public void login()
{
	Reporter.log("login",true);
}
@AfterMethod
public void logout()
{
	Reporter.log("logout",true);
}
@AfterClass
public void CloseBrowser()
{
	Reporter.log("closeBrowser",true);
}
@Test
public void CreateCustomer()
{
	Reporter.log("CreateCustomer");
}
@Test
public void ModiferCustomer()
{
	Reporter.log("Modifyercustomer",true);
}
public void deleteCustomer() 
{
    Reporter.log("deleteCustomer",true);	
}
}
