package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Task13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
	}

}
