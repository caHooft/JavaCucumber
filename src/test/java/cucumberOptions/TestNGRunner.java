package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//features and glue -> provides path to runner
//monochrome makes test output more readable
//tags makes it possible to only run tests with that tag
//plugin ??

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome=true )
        //,tags="SmokeTest or @RegressionTest"
        //plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"} )
public class TestNGRunner extends AbstractTestNGCucumberTests
{

	
	
}
