package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'])[1]"));
        email.sendKeys("sarakennedy0611@gmail.com");
        WebElement pass  = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'])[2]"));
        pass.sendKeys("1234567");
        WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
        login.click();
	}
	}
	


