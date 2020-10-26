package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"StepDefinitions"})
public class NegativeScenarioRunner extends NegativeScenario{

}
