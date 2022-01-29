package com.test.reportUtility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CreateReport {

	static ExtentReports report;
	public static ExtentTest test;
	
	
	public void initialiseReport(){
		
		report = new ExtentReports(System.getProperty("user.dir")+"//report//ExtentReportResults.html");
		
	}
	
	public void startTest(String tcName) {
		test = report.startTest(tcName);
	}
	
	
	
	public void endTest()
	{
	report.flush();
	}
}
