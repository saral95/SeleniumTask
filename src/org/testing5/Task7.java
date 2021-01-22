package org.testing5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement name = driver.findElement(By.name("q"));
		name.sendKeys("greens velmurugan");
		Thread.sleep(4000);
		WebElement pass = driver.findElement(By.xpath("(//div[@class='V7Sr0 p5AXld PpBGzd YcUVQe'])[1]"));
		pass.click();
        
}


}
