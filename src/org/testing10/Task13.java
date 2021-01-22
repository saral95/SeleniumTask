package org.testing10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13 {
	public static void main(String[] args) {
		
		       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		        
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("http://greenstech.in/selenium-course-content.html");
				driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]")).click();
				driver.findElement(By.xpath("//a[text()=' TESTNG']")).click();
				String parid = driver.getWindowHandle();
				Set<String> allwind = driver.getWindowHandles();
				for (String x : allwind) {
					if(!x.equals(parid)) {
						driver.switchTo().window(x);
					}
					
				}
				WebElement print = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
                System.out.println(print.getText());
}
}
