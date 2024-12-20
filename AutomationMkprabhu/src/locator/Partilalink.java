package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partilalink {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Mkprabhu/Desktop/Demo2.html");
	driver.findElement(By.name("n1")).click();
	driver.navigate().back();
	driver.findElement(By.name("n2")).click();
	driver.close();
}
}
