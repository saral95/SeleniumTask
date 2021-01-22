package org.testing12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement UserName= driver.findElement(By.id("username"));
		WebElement Pass= driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value', 'Sara')", UserName);
		
		js.executeScript("arguments[0].setAttribute('value', '123456')", Pass);
        
		js.executeScript("arguments[0].click()", login);

		
	}}