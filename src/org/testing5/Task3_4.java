package org.testing5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_4 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		//WebElement printBranch = driver.findElement(By.xpath("(//h6[text()='Greens Technology '])[1]"));
		WebElement adayarAddress = driver.findElement(By.xpath("(//p[@class='mail-info'])[1]"));
		
		WebElement omrAddress = driver.findElement(By.xpath("(//p[@class='mail-info'])[3]"));
//		WebElement printStreet = driver.findElement(By.xpath("(//p[@class='mail-info'])[3]"));
//		WebElement print = driver.findElement(By.xpath(""));
		
        String txt = adayarAddress.getText();
        String txt1 = omrAddress.getText();
        System.out.println(txt);
        System.out.println(txt1);


}
}