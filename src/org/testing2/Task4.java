package org.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Task4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement txtuser = driver.findElement(By.id("DUMMY1"));
		txtuser.sendKeys("Sara");
		WebElement arrow = driver.findElement(By.id("user-id-goahead"));
		arrow.click();
		WebElement txtpass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtpass.sendKeys("1234");
	}

}
