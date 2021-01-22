package org.testing10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("iphone x");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Actions a = new Actions(driver);
        WebElement iph = driver.findElement(By.xpath("//span[text()='Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)']"));
        
        a.contextClick(iph).perform();
        Robot r=new Robot();
       
        	r.keyPress(KeyEvent.VK_DOWN);
        	r.keyRelease(KeyEvent.VK_DOWN);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            String parwin = driver.getWindowHandle();
            Set<String> allwin = driver.getWindowHandles();
           for (String x : allwin) {
        	   if(!x.equals(parwin))
        	   {
        		   driver.switchTo().window(x);
        	   }
           }
        	   WebElement add = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        	   add.click();
        	   Thread.sleep(6000);
     	   WebElement printPrice = driver.findElement(By.xpath("(//span[text()='$390.00'])[1]"));
        	   System.out.println(printPrice.getText());
	}
}


