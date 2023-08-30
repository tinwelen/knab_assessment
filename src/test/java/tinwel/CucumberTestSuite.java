package tinwel;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@Suite
@IncludeEngines("cucumber")
@RunWith(CucumberWithSerenity.class)
/*@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features"
)
 */
@SelectClasspathResource("/features")
public class CucumberTestSuite {}
