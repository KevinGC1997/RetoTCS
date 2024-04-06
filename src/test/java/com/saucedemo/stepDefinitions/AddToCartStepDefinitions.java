package com.saucedemo.stepDefinitions;


import com.saucedemo.questions.ValidateProduct;
import com.saucedemo.task.AddToProductCart;
import com.saucedemo.task.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;


import static com.saucedemo.stepDefinitions.ParameterTypeDef.user;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class AddToCartStepDefinitions {

    @Given("^that user access successfully to the (.*)$")
    public void thatUserAccessSuccessfullyToTheHttpsWwwSaucedemoCom(String website) {
        user.attemptsTo(
                Open.url(website));

    }

    @When("^the user filters by (.*) to add cart$")
    public void theUserFiltersByPriceHighToLowToAddCart(String filters) {
        user.attemptsTo(
                Login.onThesite(),
                AddToProductCart.onThesite(filters)
        );
    }

    @Then("^validate that object was (.*)$")
    public void validateThatObjectWasSauceLabsFleeceJacket(String object) {
        user.should(
                seeThat(
                        "validate prodcut", ValidateProduct.validate(), Matchers.containsString(object)
                ));
    }
}
