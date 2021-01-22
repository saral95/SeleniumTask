package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://greenstech.in/selenium-course-content.html");
        WebElement clickmodel = driver.findElement(By.xpath("//div[@id='heading201']"));
        clickmodel.click();
        WebElement clickmodel1 = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
        clickmodel1.click();
        
	}
	}
	