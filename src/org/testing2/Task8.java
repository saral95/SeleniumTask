package org.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
	    WebElement txtuser = driver.findElement(By.name("username"));
		txtuser.sendKeys("7639635053");
		WebElement txtpass = driver.findElement(By.name("password"));
		txtpass.sendKeys("1234567");
	}
	

}