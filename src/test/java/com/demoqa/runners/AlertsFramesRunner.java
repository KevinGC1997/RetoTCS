package com.demoqa.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.demoqa.features/AlertsFrame.feature",
        glue = "com.demoqa.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AlertsFramesRunner {
}
