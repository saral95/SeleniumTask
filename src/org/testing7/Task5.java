package org.testing7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement down = driver.findElement(By.xpath("//h2[contains(text(),'Job Openings')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", down);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\screenshot\\output.jpeg");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(2000);
		WebElement up = driver.findElement(By.xpath("//h3[contains(text(),'Online Classroom')]"));
		js.executeAsyncScript("arguments[0].scrollIntoView()", up );
		
		
}
}