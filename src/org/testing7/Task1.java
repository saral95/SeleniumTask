package org.testing7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	//typecasting
	TakesScreenshot ts =  (TakesScreenshot) driver;
	//take screenshot and stored in temp location
	File src = ts.getScreenshotAs(OutputType.FILE);
	//create a new file location
	File dest = new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\screenshot\\screen.png");
	
	FileUtils.copyFile(src, dest);
	
	
	
	
}
}
