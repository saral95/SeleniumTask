package org.testing8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		WebElement userID = driver.findElement(By.xpath("//input[@type='text']"));
		userID.sendKeys("saral1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		WebElement pass = driver.findElement(By.name("fldPassword"));
		pass.sendKeys("12345");

}
}