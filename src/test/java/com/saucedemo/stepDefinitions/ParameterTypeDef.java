package com.saucedemo.stepDefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class ParameterTypeDef {

    @Managed(driver = "chrome")
    public static WebDriver driver;
    public static Actor user = Actor.named("User");

    @Before
    public void prepareActorStage() {
      WebDriverManager.chromedriver().setup();
      driver = WebDriverManager.chromedriver().getWebDriver();
      user.can(BrowseTheWeb.with(driver));
    }


}
