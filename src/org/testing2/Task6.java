package org.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.swiggy.com/");
	    WebElement txtuser = driver.findElement(By.id("location"));
		txtuser.sendKeys("Gudiyattam, Vellore");
	}
	

}