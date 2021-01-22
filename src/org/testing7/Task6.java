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

public class Task6 {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	
	WebElement tillSelenium = driver.findElement(By.xpath("(//h3[@class='mb-0'])[12]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeAsyncScript("arguments[0].scrollIntoView(true)", tillSelenium);
	
	Thread.sleep(5000);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\screenshot\\task6.jpeg");
	FileUtils.copyFile(src, file);
	
}
}
