package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement login = driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
        login.click();
        WebElement userName = driver.findElement(By.xpath("//input[@type='text]"));
        userName.sendKeys("sarakennedy0611@gmail.com");
        WebElement pass = driver.findElement(By.xpath("//input[@class='password]"));
        pass.sendKeys("12345");
                
	}
	}
	