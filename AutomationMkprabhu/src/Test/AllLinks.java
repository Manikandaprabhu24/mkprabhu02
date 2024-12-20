package Test;

import java.time.Duration;
import java.util.List;
import java.util.jar.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.amazon.in/");
    List<WebElement> all = driver.findElements(By.tagName("a"));
    int count=all.size();
    System.out.print(count);
    
    for (int i=0;i<count;i++) 
    {
    	String text=all.get(i).getText();
    	System.out.print(text);
    }
    driver.quit();
}
}
