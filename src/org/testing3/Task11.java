package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys("Sara");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        lastName.sendKeys("Kennedy");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("kennedysara199");
        WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
        pass.sendKeys("sarakennedy12345");
        WebElement confirmPass = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
        confirmPass.sendKeys("sarakennedy12345");
        WebElement next = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']"));
        next.click();
        WebElement mobile = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
        mobile.sendKeys("7658975678");


        

	}
	}
	


