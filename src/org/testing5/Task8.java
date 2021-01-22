package org.testing5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("sara123");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123");
        String txt = name.getAttribute("value");
        System.out.println(txt);
        String txt1 = pass.getAttribute("value");
        System.out.println(txt1);

}


}
