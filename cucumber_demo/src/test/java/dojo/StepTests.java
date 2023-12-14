package dojo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepTests {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void who_wants_to_buy_a_drink(String name) {
        this.order = new Order();
        this.order.declareOwner(name);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for(String name) {
        order.setName(name);
        assertEquals(name, this.order.getName());
    }

    @Then("there is/are {int} cocktail(s) in the order")
    public void there_is_x_cocktail_in_the_order(int amount) {
        List<String> cocktails = order.getContent();
        assertEquals(amount, cocktails.size());
    }

    @When("{int} cocktails are added to the order")
    public void cocktails_are_added_to_the_order(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        for (int i = 0; i < int1; i++) {
            this.order.addCocktail("Moscow Mule");
        }
    }
}
