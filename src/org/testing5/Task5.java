package org.testing5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement parah = driver.findElement(By.xpath("//p[contains(text(), 'is a leading Training')]"));
        String txt = parah.getText();
        System.out.println(txt);

}
}
