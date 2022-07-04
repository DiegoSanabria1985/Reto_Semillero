package com.farmatodo.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/farmatodo.feature",
        glue = "com.farmatodo.app.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class buscarRunner {
}
