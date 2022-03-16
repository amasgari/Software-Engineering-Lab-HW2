import calculator.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SqrtDivStepDef {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two integers (\\-?\\d+) and (\\-?\\d+)$")
    public void twoIntegersAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I divide and sqrt the two values$")
    public void iDivideAndSqrtTheTwoValues() {
        result = calculator.sqrt_div(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the answer (\\d+)$")
    public void iExpectTheAnswer(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
