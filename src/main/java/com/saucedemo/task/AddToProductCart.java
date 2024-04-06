package com.saucedemo.task;

import com.saucedemo.interactions.SelectOptionEnd;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.saucedemo.userInterfaces.AddToCardUI.*;

public class AddToProductCart implements Task {

    String text;

    public AddToProductCart(String text) {
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectOptionEnd.here(BTN_FILTER, text),
                Click.on(BTN_PRODUCT),
                Click.on(BTN_CART)
        );
    }
    public static AddToProductCart onThesite(String text){
        return Instrumented.instanceOf(AddToProductCart.class).withProperties(text);
    }
}
