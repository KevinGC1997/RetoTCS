package com.demoqa.stepDefinitions;

import com.demoqa.questions.ValidateConfirmAlert;
import com.demoqa.questions.ValidatePromptAlert;
import com.demoqa.tasks.GoToAlertsFrame;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static com.demoqa.stepDefinitions.ParameterTypeDef.user;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AlertsFrameStepDefinitions {

    @When("the user go to alert Frame")
    public void theUserGoToAlertFrame() {

        user.attemptsTo(
                GoToAlertsFrame.onTheSite()
        );
    }

    @Then("the validate (.*)  (.*)$")
    public void theUserTestValidate(String confirmAlert, String promptAlert){
        user.should(

                seeThat(
                        "validate confirmed alert", ValidateConfirmAlert.validate(),
                        Matchers.containsString(confirmAlert)),
                seeThat("validate prompt alert", ValidatePromptAlert.validate(),
                        Matchers.containsString(promptAlert))
        );
    }
}
