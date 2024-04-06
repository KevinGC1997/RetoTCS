package com.demoqa.stepDefinitions;

import com.demoqa.questions.ValidateMultipleColor;
import com.demoqa.questions.ValidateSingleColor;
import com.demoqa.tasks.GoToAutoComplete;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;


import static com.demoqa.stepDefinitions.ParameterTypeDef.user;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;



public class AutoCompleteStepDefinitions {

    @Given("^that user access successfully to the (.*)$")
    public void thatUserAccessSuccessfully(String website) {
        user.attemptsTo(Open.url(website));

    }
    @When("the user go to auto complete to enter (.*) (.*)$")
    public void theUserGoToAutoCompleteToEnterBlackWhite(String colorBlack, String colorWhite) {
        user.attemptsTo(
                GoToAutoComplete.onTheSite(colorBlack, colorWhite)
        );
    }
    @Then("the user validate (.*) (.*)$")
    public void theUserValidate(String colorBlack, String colorWhite) {

        user.should(

                seeThat(
                        "validate multi color", ValidateMultipleColor.validate(),
                        Matchers.containsString(colorBlack)),
                seeThat("validate single color", ValidateSingleColor.validate(),
                        Matchers.containsString(colorWhite))
        );
    }
}
