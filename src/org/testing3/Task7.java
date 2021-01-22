package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.cleartrip.com/trains");
        WebElement from = driver.findElement(By.xpath("//input[@id='from_station']"));
        from.sendKeys("Chennai");
        WebElement to = driver.findElement(By.xpath("//input[@id='to_station']"));
        to.sendKeys("Bangalore");
        WebElement searchTrain = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
        searchTrain.click();
        
        
        
	}
	}
	