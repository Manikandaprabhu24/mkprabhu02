package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoLoginPage {
	private WebElement untext;
	private WebElement pwdtext;
	private WebElement loginbutn;
	
	DemoLoginPage(WebDriver driver)
	{
		untext=driver.findElement(By.id("username"));
		pwdtext=driver.findElement(By.name("pwd"));
		loginbutn=driver.findElement(By.xpath("//div[text()='login']"));
	}
public void login()
{
	untext.sendKeys("admin");
	pwdtext.sendKeys("manager");
	loginbutn.click();
}
}
