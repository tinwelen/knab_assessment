package tinwel;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@Suite
@IncludeEngines("cucumber")
@RunWith(CucumberWithSerenity.class)
@SelectClasspathResource("/features/Automated")
public class CucumberTestSuite {}
