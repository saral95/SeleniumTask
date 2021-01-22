package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.swiggy.com/");
        WebElement signup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
        signup.click();
        WebElement phNum = driver.findElement(By.xpath("//input[@name='mobile']"));
        phNum.sendKeys("7639635053");
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("Sara");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("sarakennedy0611@gamil.com");
        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("12345678");
        WebElement next = driver.findElement(By.xpath("//a[@class='a-ayg']"));
        next.click();
        
        
        
        
        


        

	}
	}
	


