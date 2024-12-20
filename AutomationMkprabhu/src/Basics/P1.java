package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("emil")).sendKeys("12345");
		driver.findElement(By.id("pass")).sendKeys("java");
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.xpath("/center/input[@class='gNO89b']/following-sibling::input/ancestor::div[@class='L3eUgb']/child::div[@class='o3j99 n1xJcf Ne6nSd']")).click();
	}
		
	}


