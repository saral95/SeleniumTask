package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        WebElement signin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
        signin.click();
        WebElement register = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
        register.click();
        
        WebElement mobile = driver.findElement(By.xpath("//input[@id='userName']"));
        mobile.sendKeys("7639635053");
        
        
        
        
        
        
        


        

	}
	}
	


