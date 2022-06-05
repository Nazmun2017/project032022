package com.amazon.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class AmazonTestRunner {
	
	@CucumberOptions(
			
			features= {"Features"},
			glue= {"com.amazon.Stepdefs"}
			
			)
	
	 public class TestRunner extends AbstractTestNGCucumberTests{
		
	}
	
	
	
}