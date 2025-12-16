package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.stepDefinitions", "org.example.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
        //tags = "@TEST-1234"
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
