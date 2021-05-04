package org.petstore.cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/petstore/features",glue={"org.petstore.stepDefinitions"})
public class TestRunner {
}
