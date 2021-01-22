package org.testing11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\SeleniumClass\\\\driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	driver.manage().window().maximize();
	
	WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
	String text = table.getText();
	System.out.println(text);
	
	
	
	
	
	
}
}
