package org.testing12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName= driver.findElement(By.id("email"));
		WebElement txtPass= driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.id("u_0_b"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value', 'sarakennedy0611@gmail.com')", txtUserName);
		
		js.executeScript("arguments[0].setAttribute('value', '123456')", txtPass);
        
		js.executeScript("arguments[0].click()", login);

		
	}}