package com.saucedemo.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/com.saucedemo.features/addToCart.feature",
        glue = "com.saucedemo.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AddToCartRunner {
}
