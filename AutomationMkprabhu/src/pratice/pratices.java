package pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratices {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com");
		List<WebElement> links = driver.findElements(By.linkText("a"));
		int count =links.size();
		System.out.println(count);
		for (int i=0;i<count; i++)
		{
            String text=links.get(i).getText();	
            System.out.println(text);
		}
	}

}
