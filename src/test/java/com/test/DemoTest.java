package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.genericUtility.Util;
import com.test.genericUtility.Web;
import com.test.pageUtility.HomePage;

public class DemoTest {
	
	@Test
	public void demo() throws IOException, InterruptedException {
		
		new HomePage().invokeHomePage();
		Thread.sleep(2000);
		
		System.out.println("Hello World");
		
		//web.wait(driver.findElement(By.xpath("//input[@type='text']")));		
		Web.getDriver().findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abc");
		Thread.sleep(2000);
		
		//web.quitDriver();
	}

}
