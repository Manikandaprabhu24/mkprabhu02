package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
      public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.linkText("Alert with OK")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
}
