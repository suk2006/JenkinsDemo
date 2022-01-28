package com.test.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
	
	private Properties envDetailsProperties;
	private Properties searchDataProperties;
	
	private Properties getDataFromEnvDetailsProperties() throws IOException {		
		
		Properties properties = new Properties();
		FileInputStream fileInput = new FileInputStream("./config/envDetails.properties");
		properties.load(fileInput);
		
		return properties;
	}

	public Properties getEnvDetailsProperties() throws IOException {
		System.out.println("hello util");
		System.out.println(getDataFromEnvDetailsProperties().getProperty("chromeDriverPath"));
		envDetailsProperties = getDataFromEnvDetailsProperties();
		return envDetailsProperties;
	}	
	
	private Properties getDataFromsearchDataProperties() throws IOException {
		
		Properties properties = new Properties();
		FileInputStream fileInput = new FileInputStream("./testData/searchData.properties");
		properties.load(fileInput);
		
		return properties;
	}
	
	public Properties getSearchDataProperties() throws IOException {
		
		searchDataProperties = getDataFromsearchDataProperties();
		
		return searchDataProperties;
	}

}
