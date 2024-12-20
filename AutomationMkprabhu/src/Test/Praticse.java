package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Praticse {
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().minimize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("mani");
	driver.findElement(By.id("pass")).sendKeys("mkp");
    driver.findElement(By.name("login")).click();
   }

}
