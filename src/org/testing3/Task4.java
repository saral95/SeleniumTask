package org.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        
        WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        firstName.sendKeys("Sara");
        
        WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        lastName.sendKeys("Kennedy");
        
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("sarakennedy0611@gmail.com");
        
        WebElement gender = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        gender.click();
        
        WebElement phNum = driver.findElement(By.xpath("//input[@id='userNumber']"));
        phNum.sendKeys("7696350534");
        WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        dob.click();
        
        WebElement dobmonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        dobmonth.click();
        dobmonth.sendKeys("February");
        WebElement dobYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        dobYear.click();
        dobYear.sendKeys("1995");
        WebElement dobDate = driver.findElement(By.xpath("//div[@aria-label='Choose Friday, December 4th, 2020']"));
        dobDate.click();
        dobDate.sendKeys("11");
       
        WebElement subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
        subject.sendKeys("Selenium");
        WebElement hobbies = driver.findElement(By.xpath("//label[text()='Reading']"));
        hobbies.click();
        
        
	}
	}
	


