package com.demoqa.userInterfacess;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertsFrameUI {

    public static final Target BTN_ALERTS_FRAME = Target.the("button to alerts frame")
            .locatedBy("//*[contains(text(), 'Alerts, Frame & Windows')]");

    public static final Target BTN_ALERTS = Target.the("button to ALERTS")
            .locatedBy("//div[@class='element-list collapse show']//li[@id='item-1']");
    public static final Target BTN_FIRST_ALERT = Target.the("button first alerts")
            .locatedBy("//button[@id='alertButton']");
    public static final Target BTN_SECOND_ALERT = Target.the("button seconds alerts")
            .locatedBy("//button[@id='timerAlertButton']");
    public static final Target BTN_THIRD_ALERT = Target.the("button third alert")
            .locatedBy("//button[@id='confirmButton']");
    public static final Target BTN_QUARTER_ALERT = Target.the("button quarter alert")
            .located(By.id("promtButton"));
    public static final Target TXT_CONFIRM_ALERT = Target.the("text accept alert")
            .locatedBy("//span[@id='confirmResult']");
    public static final Target TXT_PROMPT_ALERT = Target.the("text prompt alert")
            .locatedBy("//span[@id='promptResult']");


}
