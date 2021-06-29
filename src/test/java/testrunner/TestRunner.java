package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:\\workspace\\MyCucumberProject\\src\\test\\java\\features",
	    glue="stepdefinitions",
	    plugin= {"pretty","html:HTML-Reports"},
	    monochrome=true
	    )
	public class TestRunner extends AbstractTestNGCucumberTests{

	}
