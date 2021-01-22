package org.testing10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		Actions a=new Actions(driver);
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		a.moveToElement(course).perform();
		driver.findElement(By.xpath("(//span[text()='Python'])[1]")).click();
		Thread.sleep(7000);
		WebElement dd = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
        a.contextClick(dd);
        
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
	}

}
