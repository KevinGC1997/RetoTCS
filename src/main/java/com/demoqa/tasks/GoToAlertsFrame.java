package com.demoqa.tasks;

import com.demoqa.interactions.TestJavaScriptAlert;
import com.demoqa.questions.ValidateConfirmAlert;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import util.DataExcel;

import java.io.IOException;

import static com.demoqa.userInterfacess.AlertsFrameUI.*;
import static util.Constants.*;

public class GoToAlertsFrame implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        DataExcel data = new DataExcel();

        try {
            actor.attemptsTo(
                    Scroll.to(BTN_ALERTS_FRAME),
                    Click.on(BTN_ALERTS_FRAME),
                    Scroll.to(BTN_ALERTS),
                    Click.on(BTN_ALERTS),
                    Scroll.to(BTN_FIRST_ALERT),
                    TestJavaScriptAlert.onTheSite(BTN_FIRST_ALERT, data.readExcelData(alertsData, routeExcel,1,0),null),
                    TestJavaScriptAlert.onTheSite(BTN_SECOND_ALERT, data.readExcelData(alertsData, routeExcel,2,0),null),
                    TestJavaScriptAlert.onTheSite(BTN_THIRD_ALERT, dismissAlert,data.readExcelData(alertsData, routeExcel,3,0)),
                    Ensure.that(ValidateConfirmAlert.validate()).isEqualTo(messageDismissAlert),
                    TestJavaScriptAlert.onTheSite(BTN_THIRD_ALERT, data.readExcelData(alertsData, routeExcel,3,0),null),
                    TestJavaScriptAlert.onTheSite(BTN_QUARTER_ALERT,data.readExcelData(alertsData, routeExcel,4,0),null)

            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static GoToAlertsFrame onTheSite(){
        return Instrumented.instanceOf(GoToAlertsFrame.class).withProperties();
    }
}
