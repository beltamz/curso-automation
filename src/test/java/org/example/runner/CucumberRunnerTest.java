package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.stepDefinitions", "org.example.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
        //tags = "@TEST-1234" Quiero que me ejecute y reporte todos los tests, entonces no pongo tags
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
