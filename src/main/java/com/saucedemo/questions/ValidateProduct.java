package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.saucedemo.userInterfaces.AddToCardUI.TXT_PRODUCT_NAME;

public class ValidateProduct implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return TXT_PRODUCT_NAME.resolveFor(actor).getText();
    }

    public static Question<String> validate(){
        return new ValidateProduct();
    }
}
