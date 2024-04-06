package com.saucedemo.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target TXT_USER = Target.the("input user")
            .locatedBy("//input[@id='user-name']");
    public static final Target TXT_PASSWORD = Target.the("input password")
            .located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("button login")
            .locatedBy("//input[@id='login-button']");

}
