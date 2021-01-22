package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.redbus.in/");
        WebElement click = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
        click.click();
        WebElement signin = driver.findElement(By.xpath("//li[@id='signInLink']"));
        signin.click();
        WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']"));
        mobile.sendKeys("7639635053");
        
        
        
	}
	}
	