package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.stepDefinitions", "org.example.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
        //Quiero que me ejecute todos los tests, entonces no pongo tags
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
