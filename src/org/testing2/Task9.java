package org.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Register.html");
	    WebElement txtuserfirst = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		txtuserfirst.sendKeys("Saral");
		WebElement txtuserlast = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
		txtuserlast.sendKeys("Kennedy");
		
	}
	

}