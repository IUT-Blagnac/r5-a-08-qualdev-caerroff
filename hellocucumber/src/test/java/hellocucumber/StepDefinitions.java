package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private String today;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is sunday")
    public void today_is_sunday() {
        // Write code here that turns the phrase above into concrete actions
        this.today = "Sunday";
    }

    @When("I ask if it is friday")
    public void i_ask_if_it_is_friday() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Friday", this.today);

    }

    @Then("I should be told {string}")
    public void i_should_be_told(String input) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

        // assertEquals(expectedAnswer, actualAnswer);
    }

}
