package org.testing4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task11 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
        
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		Actions a = new Actions(driver);
		WebElement allDept = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(allDept).perform();;
		WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		

		a.moveToElement(heat).perform();
		
		Thread.sleep(5000);
		
		WebElement aircond = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
		a.moveToElement(aircond);
		
		driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']")).click();


}
}
