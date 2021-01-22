package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
        WebElement mobile = driver.findElement(By.xpath("//input[@maxlength='10']"));
        mobile.sendKeys("7639635053");
        WebElement clickcontinue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
        clickcontinue.click();
        


        

	}
	}
	


