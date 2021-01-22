package org.testing8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	}

}
