package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
	}

}
