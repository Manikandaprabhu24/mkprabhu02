package Basics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualtitle);
		System.out.println(actualurl);
		String expectedtitle = "google";
		 String expectedurl = "google.com/";
		 if(actualtitle.equalsIgnoreCase(expectedtitle)&& actualurl.contains(expectedurl) ) {
			 System.out.println("pass:url and title are same");
			 
		 }
		 else
		 {
			 System.out.println("fail:url and title are different");
		 }
		 driver.quit();
	}

}
