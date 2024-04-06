package com.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.demoqa.userInterfacess.AutoCompleteUI.TXT_SINGLE_COLOR;

public class ValidateSingleColor  implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return TXT_SINGLE_COLOR.resolveFor(actor).getText();
    }
    public static Question<String> validate(){
        return new ValidateSingleColor();
    }
}
