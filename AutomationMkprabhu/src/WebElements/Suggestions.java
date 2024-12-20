package WebElements;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestions {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://www.google.com");
	d.findElement(By.name("q")).sendKeys("java");
	List<WebElement> sugg=d.findElements(By.xpath("//span[contains(text(),'java')]"));
	int count=sugg.size();
	System.out.println(count);
	for (int i=0;i<count; i++)
	{
		String text=sugg.get(i).getText();
	
		System.out.println(text);
		
	}
		
	}
	
}
