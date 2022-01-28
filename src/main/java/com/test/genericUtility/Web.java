package com.test.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web {
	
	private static WebDriver driver;
	
	private WebDriver invokeChromeDriver() throws IOException {
		
		System.out.println("hello web");
		System.setProperty("webdriver.chrome.driver", new Util().getEnvDetailsProperties().getProperty("chromeDriverPath"));
		driver = new ChromeDriver();
		String url = new Util().getEnvDetailsProperties().getProperty("url");
		System.out.println("url is: " + url);
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
	
	public static void setDriver() throws IOException {
		
		driver = new Web().invokeChromeDriver();
	}
	
	public void print() {
		
		System.out.println("hello web");
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	public void wait(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void quitDriver() {
		
		driver.quit();
	}

}
