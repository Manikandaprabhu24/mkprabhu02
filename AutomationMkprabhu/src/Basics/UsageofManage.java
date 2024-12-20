package Basics;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofManage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver .manage().window().minimize();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		//driver.manage().window().setSize(new Dimension(300,180));
		//driver.manage().window().getPosition(new Point(200,700));

	}

}
