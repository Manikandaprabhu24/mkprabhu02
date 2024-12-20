package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	private static int i;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count=alllinks.size();
		System.out.print(count);
		for(int i=0;i<=count;i++);
		{
			String text=alllinks.get(i).getText();
			System.out.print(text);
			
		}
			
      driver.close();
	}

}
