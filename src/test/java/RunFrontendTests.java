import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"org.kuhn.cucumber.runners.gluecode"},
        plugin = {"pretty", "json:target/cucumber-reports/CurrentRunnerReport.json"},
        features = "classpath:frontendtests",
        tags = "not @ignore")
public class RunFrontendTests {
}
