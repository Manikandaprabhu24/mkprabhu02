package Test;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionINgoogle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("java");
	//List<WebElement>ele=driver.findElement(By.xpath("//span[contains(text(),'java')]"));
	//int count=ele.size();
	//System.out.println(count);
	//for (int i=0;i<count;i++)
	{
		//String text=ele.get(i).getText();
		//System.out.println(text);
		
	}
	
}
}
