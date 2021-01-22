package org.testing11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\SeleniumClass\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < rows.size(); i++) {
			if (i % 2 == 0) {
				WebElement row = rows.get(i);
				List<WebElement> dataCells = row.findElements(By.tagName("td"));

				for (int j = 0; j < dataCells.size(); j++) {
					if (j%2==0) {
						WebElement data = dataCells.get(j);
                        System.out.println(data.getText());
					}
					}
					
			}

		}
	}
}