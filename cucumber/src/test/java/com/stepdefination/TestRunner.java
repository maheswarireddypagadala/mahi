package com.stepdefination;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)  
//fearutes="flodername",glue="packagename")
@CucumberOptions(features="OrangeHRMApplicationTest",
                             glue="com.stepdefination",
                             monochrome=true)

public class TestRunner {

}
