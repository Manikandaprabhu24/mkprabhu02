package Basics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) {
	   WebDriver drvier=new ChromeDriver();
	   drvier.get("file:///c:Users/mkpY/Desktop/vina.html");
	   drvier.findElement(By.tagName("a")).click();
	   drvier.navigate().back();
	   drvier.findElement(By.id("d1")).click();
	   drvier.navigate().back();
	   drvier.findElement(By.name("d1")).click();
	   drvier.navigate().back();
	   drvier.findElement(By.className("c1")).clear();
	   drvier.navigate().back();
	   

	}

}
