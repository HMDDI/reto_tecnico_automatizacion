package org.proyecto.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/base.feature"
        },
        glue = "org.proyecto.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
