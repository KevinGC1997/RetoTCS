package com.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.demoqa.userInterfacess.AlertsFrameUI.TXT_PROMPT_ALERT;

public class ValidatePromptAlert implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return TXT_PROMPT_ALERT.resolveFor(actor).getText();
    }
    public static Question<String> validate(){
        return new ValidatePromptAlert();
    }
}
