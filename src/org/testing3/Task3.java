package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        WebElement firstName = driver.findElement(By.xpath("//input[@type='text']"));
        firstName.sendKeys("Sara");
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Kennedy");
        WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
        address.sendKeys("109 Valathur, Gudiyattam, Vellore-635813");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("sarakennedy0611@gmail.com");
        WebElement phNum = driver.findElement(By.xpath("//input[@type='tel']"));
        phNum.sendKeys("7696350534");
        WebElement gender = driver.findElement(By.xpath("//input[@value='FeMale']"));
        gender.click();
        WebElement hobbies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
        hobbies.click();
        WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
        password.sendKeys("Sara1234");
        WebElement confirmPass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
        confirmPass.sendKeys("Sara1234");
        WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
        submit.submit();
        
        
	}
	}
	


