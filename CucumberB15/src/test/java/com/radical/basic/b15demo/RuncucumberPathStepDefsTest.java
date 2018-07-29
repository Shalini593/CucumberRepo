package com.radical.basic.b15demo;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features ={"src/test/resources/com/radical/basic/b15demo/cucumberPath.feature", "src/test/resources/com/radical/basic/b15demo/cucumberPath1.feature"},
		glue ={"com/radical/basic/b15demo"}
		
		)


public class RuncucumberPathStepDefsTest {

}
