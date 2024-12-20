package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getdispalyed {
    public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		boolean res = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(res==true)
		{
			System.out.println("the logo is displayed");
		}
		else
		{
			System.out.println("the logo is not displayedq	");
		}
	}
}
