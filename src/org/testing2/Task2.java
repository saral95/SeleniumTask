package org.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\SeleniumClass\\\\driver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Vellore");
		WebElement destination = driver.findElement(By.id("dest"));
		destination.sendKeys("Ooty");
	}

}
