package org.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Task5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        WebElement cusId = driver.findElement(By.className("input_password"));
        cusId.sendKeys("98765363");
	}
	}
	


