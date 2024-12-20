package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createcustomer {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.findElement(By.linkText("TASKS")).clear();
    driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();Thread.sleep(2000);
	driver.findElement(By.id("customerLightBox_nameField")).sendKeys("MKPrabhu");
	driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("AutomationEngeering");
	driver.findElement(By.id("customerLightBox_customerSelectorPlaceholder")).click();Thread.sleep(2000);
	driver.findElement(By.linkText("Our Company")).click();Thread.sleep(2000);
	driver.findElement(By.id("customerLightBox_commitBtn")).click();Thread.sleep(2000);
	driver.findElement(By.id("logoutLink")).click();
	driver.quit();
	
	
}
}
