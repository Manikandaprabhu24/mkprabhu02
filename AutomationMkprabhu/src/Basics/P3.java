package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P3 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.findElement(By.linkText("create new account")).click();
     WebElement daylistbox=driver.findElement(By.id("day"));
     WebElement mothlistbox=driver.findElement(By.id("month"));
     WebElement yearlistbox=driver.findElement(By.id("year"));
     Select s=new Select(daylistbox);
     Select s1=new Select(mothlistbox);
     Select s2=new Select(yearlistbox);
     s.selectByIndex(7);
     s1.selectByValue("9");
     s2.selectByVisibleText("2000");
	}
}
