package org.testing10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.greenstechnologys.com/python-training.html");
		WebElement clk = driver.findElement(By.id("Python-Solutions-Architect-Training"));
		clk.click();
		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		
		String parid = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for (String x : allwin) {
			if(!parid.equals(allwin)) {
				driver.switchTo().window(x);
			}
			
		}
		
		
	}

}
