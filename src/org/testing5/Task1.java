package org.testing5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement print = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
        String txt = print.getText();
        System.out.println(txt);
}
}
