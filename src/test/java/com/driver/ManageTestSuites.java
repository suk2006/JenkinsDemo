package com.driver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.test.reportUtility.CreateReport;

public class ManageTestSuites {
	
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		
		System.out.println("before suite");
		new CreateReport().initialiseReport();		
	}
	
	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		
		new CreateReport().endTest();
		
	}

}
