package com.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.demoqa.userInterfacess.AutoCompleteUI.*;

public class ValidateMultipleColor implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return TXT_MULTIPLE_COLOR.resolveFor(actor).getText();
    }
    public static Question<String> validate(){
        return new ValidateMultipleColor();
    }
}
