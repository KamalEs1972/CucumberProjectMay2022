package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
				glue= {"com.stepDefiniton"},
				monochrome=true ,
				plugin= {"pretty","json:Reports\\Cucumber.json",
						"junit:Reports\\Cucumber.xml",
						"html:Reports\\Reports.html"},
				
			//strict = true,
			dryRun=false

)
public class Runner {

}
