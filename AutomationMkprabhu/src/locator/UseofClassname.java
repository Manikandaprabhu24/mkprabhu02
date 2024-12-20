package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseofClassname {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Mkprabhu/Desktop/Demo2.html");
	driver.findElement(By.className("c1")).click();Thread.sleep(2000);
	driver.navigate().back();
	
	driver.findElement(By.className("c2")).click();
}
}
