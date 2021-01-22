package org.testing12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		WebElement textEmail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Thread.sleep(3000);
		WebElement Pass= driver.findElement(By.xpath("//input[@type='password']"));
		WebElement btnLogin = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()", login);
		
		js.executeScript("arguments[0].setAttribute('value', 'sarakennedy0611@gmail.com')", textEmail);
		
		js.executeScript("arguments[0].setAttribute('value', '123456')", Pass);
        
		js.executeScript("arguments[0].click()", btnLogin);
		
		Object o = js.executeScript("return arguments[0].getAttribute('value')", textEmail);
		System.out.println(o);
		
		Object o1 = js.executeScript("return arguments[0].getAttribute('value')", Pass);
		System.out.println(o1);
	}}