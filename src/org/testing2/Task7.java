package org.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.snapdeal.com/login");
	    WebElement txtuser = driver.findElement(By.id("userName"));
		txtuser.sendKeys("7639635053");
		
	}
	

}