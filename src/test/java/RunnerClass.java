import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
/*@CucumberOptions(features = {"src/test/resources/03_Department.feature"},glue={"step_definition"},
        plugin = {"json:target/cucumber-report.json","html:target/cucumber-html"},
        tags= "@regression"

        )*/
@CucumberOptions(features = {"src/test/resources/05_Students.feature"},glue={"step_definition"},
        plugin = {"json:target/cucumber-report.json","html:target/cucumber-html"},
        tags= "@regression"

)

    public class RunnerClass {

}


