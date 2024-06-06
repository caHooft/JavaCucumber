package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//features and glue -> provides path to runner
//monochrome makes test output more readable
//tags makes it possible to only run tests with that tag
//dryRun=true makes it possible for tests to keep going after error

@CucumberOptions(features="src/test/java/features",
//,dryRun=true
glue="stepDefinitions",monochrome=true, plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"})
        //,tags="SmokeTest or @RegressionTest"
public class TestNGRunner extends AbstractTestNGCucumberTests
{
	
}