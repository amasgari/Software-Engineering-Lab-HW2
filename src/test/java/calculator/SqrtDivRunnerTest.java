package calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features/sqrt_div.feature")
@RunWith(Cucumber.class)
public class SqrtDivRunnerTest{

}