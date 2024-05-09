package com.TestRunner;


import org.junit.runner.RunWith;

import com.BaseClass.BaseClass1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\FeaturesFile\\FaceBookLoginnPage1.feature",
		glue="com.StepDefinition1",
		plugin={"pretty",
				"html:HTMLReports/FacebookLoginnPage1Report.html",
		"json:JSONReports/FacebookLoginnPage1jsonReport.json"}
			
					)
public class RunnerTest extends BaseClass1 {
	

	
	
   
}

