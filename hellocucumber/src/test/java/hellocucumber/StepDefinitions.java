package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

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

    static String isItFriday(String today) {
        return null;
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        // Write code here that turns the phrase above into concrete actions
        this.today = "Sunday";
    }

    @Given("today is Friday")
    public void today_is_fridat() {
        // Write code here that turns the phrase above into concrete actions
        this.today = "Friday";
    }

    @When("I ask whether it's Friday yet")
    public String i_ask_whether_it_s_friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        if (this.today.equals("Friday")) {
            return "TGIF";
        } else {
            return "Nope";
        }
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String answer) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(answer, this.i_ask_whether_it_s_friday_yet());
    }
}
