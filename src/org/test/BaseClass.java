package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static ChromeOptions options;
	
	public static WebDriver loadBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\ProjectMaven\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
        return driver;
	}
	
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	
	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public static void dragDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src,dest).perform();
	}
	
	public static void mouseRightClick(WebElement element) {
		a.contextClick(element).click();
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url) {
		driver.navigate().to(url);
	}
	
	public static void refreshPage() {
		driver.navigate().refresh();
	}
	
	public static void pageForward() {
		driver.navigate().forward();
	}
	
	public static void pageBack() {
		driver.navigate().back();
	}
	
	public static void removePopup() {
		options=new ChromeOptions();
	    options.addArguments("--disable-notifications");
	}
	
	public static void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	
	
	
}
