package com.demoqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.demoqa.userInterfacess.AutoCompleteUI.*;

public class GoToAutoComplete implements Task {

    String colorBlack;
    String colorWhite;

    public GoToAutoComplete(String colorBlack, String colorWhite) {
        this.colorBlack = colorBlack;
        this.colorWhite = colorWhite;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_WIDGETS),
                Click.on(BTN_WIDGETS),
                Scroll.to(BTN_AUTO_COMPLETE),
                Click.on(BTN_AUTO_COMPLETE),
                Scroll.to(LBL_MULTIPLE_COLOR),
                Enter.theValue(colorBlack).into(LBL_MULTIPLE_COLOR).thenHit(Keys.ENTER),
                Enter.keyValues(colorWhite).into(LBL_SINGLE_COLOR).thenHit(Keys.ENTER)
        );
    }
    public static GoToAutoComplete onTheSite(String colorBlack, String colorWhite){
        return Instrumented.instanceOf(GoToAutoComplete.class).withProperties(colorBlack, colorWhite);
    }
}
