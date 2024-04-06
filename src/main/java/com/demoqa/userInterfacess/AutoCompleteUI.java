package com.demoqa.userInterfacess;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutoCompleteUI {

    public static final Target BTN_WIDGETS = Target.the("button to widgets")
            .locatedBy("//*[contains(text(), 'Widgets')]");
    public static final Target BTN_AUTO_COMPLETE = Target.the("button to auto complete")
            .locatedBy("//*[contains(text(), 'Auto Complete')]");
    public static final Target LBL_MULTIPLE_COLOR = Target.the("input to multiple color")
            .located(By.id("autoCompleteMultipleInput"));

    public static final Target LBL_SINGLE_COLOR = Target.the("input to single color")
            .located(By.id("autoCompleteSingleInput"));

    public static final Target TXT_MULTIPLE_COLOR = Target.the("text multiple color")
            .located(By.id("autoCompleteMultipleContainer"));
    public static final Target TXT_SINGLE_COLOR = Target.the("text single color")
            .located(By.id("autoCompleteSingleContainer"));
}
