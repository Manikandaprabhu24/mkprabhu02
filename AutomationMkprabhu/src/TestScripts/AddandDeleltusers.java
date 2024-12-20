package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddandDeleltusers {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("USERS")).click();
	    driver.findElement(By.className("buttonText")).click();
		driver.findElement(By.name("firstName")).sendKeys("Mani");
		driver.findElement(By.name("lastName")).sendKeys("prabhu");
	    driver.findElement(By.name("email")).sendKeys("mani24@gmail.com");
		driver.findElement(By.name("username")).sendKeys("MANI");
		driver.findElement(By.name("password")).sendKeys("MKP");
	    driver.findElement(By.name("passwordCopy")).sendKeys("MKP");
	    
		
	}

}
