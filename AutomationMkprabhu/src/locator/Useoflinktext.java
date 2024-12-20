package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useoflinktext {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/VINAY/Desktop/Demo2.html");
	driver.findElement(By.id("d1")).click();
	driver.navigate().back();
	driver.findElement(By.id("d2")).click();
	
}
}
