package com.test.pageUtility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.genericUtility.Util;
import com.test.genericUtility.Web;

public class HomePage {
	
	public void invokeHomePage() throws IOException, InterruptedException {
		
		Web.setDriver();
		
		Web.getDriver().findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(new Util().getSearchDataProperties().getProperty("dataOne"));
		Web.getDriver().findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		
	} 

}
