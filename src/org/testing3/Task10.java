package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement enterProduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        enterProduct.sendKeys("Watches for ladies");
        WebElement search = driver.findElement(By.xpath("//input[@type='submit'][1]"));
        search.click();
	}
	}
	


