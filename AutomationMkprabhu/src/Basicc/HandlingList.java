package Basicc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file;///C:/User");
		WebElement City=driver.findElement(By.id("City"));

	}

}
