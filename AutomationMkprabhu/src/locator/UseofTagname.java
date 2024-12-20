package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseofTagname {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Mkprabhu/Desktop/Demo2.html");
        driver.findElement(By.tagName("a")).click();
	}

}
