package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.driver.ManageTestSuites;
import com.relevantcodes.extentreports.LogStatus;
import com.test.genericUtility.Web;
import com.test.pageUtility.HomePage;
import com.test.reportUtility.CreateReport;

public class DemoTest extends ManageTestSuites{
	
	@Test
	public void demo() throws IOException, InterruptedException {
		
		new CreateReport().startTest("demo");
		
		
		try {
			
			new HomePage().invokeHomePage();
			CreateReport.test.log(LogStatus.PASS, "Google.com is opening properly");
			Thread.sleep(2000);
			
			System.out.println("Hello World");
			
			//web.wait(driver.findElement(By.xpath("//input[@type='text']")));		
			Web.getDriver().findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abc");
			CreateReport.test.log(LogStatus.PASS, "Entering string in gmail");
			Thread.sleep(2000);			
			
		}catch(Exception e) {
			
			CreateReport.test.log(LogStatus.FAIL, "Exception occured");
		}finally {
			
			new Web().quitDriver();
		}
		
	}

}
