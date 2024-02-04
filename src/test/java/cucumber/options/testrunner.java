package cucumber.options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/feature",glue ={"stepdefination","helper"} ,tags = "@Reg",
plugin = "html:target/test/report.html")

public class testrunner extends AbstractTestNGCucumberTests {
	

}
 