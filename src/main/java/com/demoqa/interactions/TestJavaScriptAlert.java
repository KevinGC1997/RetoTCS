package com.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static util.Constants.*;


public class TestJavaScriptAlert implements Interaction {

    Target element;
    String text;
    String dismiss;

    public TestJavaScriptAlert(Target element, String text, String dismiss) {
        this.element = element;
        this.text = text;
        this.dismiss = dismiss;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // define variables
        WebDriver valor = actor.recall(keyRemember);
        Alert alert;

        //click with method javascript
        JavascriptExecutor jse = (JavascriptExecutor) valor;
        jse.executeScript("arguments[0].click();", element.resolveFor(actor));

        //case to alert
        switch (text) {
            case "This alert appeared after 5 seconds":
                actor.attemptsTo(ExplicitWait.wait(5));
                alert = valor.switchTo().alert();
                assertThat(alert.getText()).isEqualTo(text);
                alert.accept();
                break;
            case "Please enter your name":
                alert = valor.switchTo().alert();
                assertThat(alert.getText()).isEqualTo(text);
                alert.sendKeys("test");
                alert.accept();
                break;
            case "dismiss":
                alert = valor.switchTo().alert();
                assertThat(alert.getText()).isEqualTo(dismiss);
                alert.dismiss();
                break;
            default:
                alert = valor.switchTo().alert();
                assertThat(alert.getText()).isEqualTo(text);
                alert.accept();

        }
    }
    public static TestJavaScriptAlert onTheSite(Target element, String text, String dismiss) {
        return instrumented(TestJavaScriptAlert.class, element, text, dismiss);
    }
}
