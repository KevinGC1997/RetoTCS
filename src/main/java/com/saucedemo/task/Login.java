package com.saucedemo.task;

import util.DataExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static com.saucedemo.userInterfaces.LoginUI.*;
import static util.Constants.*;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        DataExcel data = new DataExcel();

        try {
            actor.attemptsTo(
                    Enter.keyValues(data.readExcelData(loginData, routeExcel,1, 0)).into(TXT_USER),
                    Enter.keyValues(data.readExcelData(loginData, routeExcel,1, 1)).into(TXT_PASSWORD),
                    Click.on(BTN_LOGIN)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Login onThesite(){
        return Instrumented.instanceOf(Login.class).withProperties();
    }
}
