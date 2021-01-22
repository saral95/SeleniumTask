package org.testing9;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\SeleniumClass\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		day.click();
		Select s = new Select(day);
		List<WebElement> opts = s.getOptions();
		for (int i = 0; i < opts.size(); i++) {
			
				WebElement evenDays = opts.get(i);
				
				String text = evenDays.getText();
				if (i%2==0) {
				System.out.println(text);
			}
			
		}
}
}