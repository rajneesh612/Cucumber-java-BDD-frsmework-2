package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", glue= {"stepDefinition"},
monochrome = true,
plugin= {"pretty","html:target/htmlReports"})
public class TestRunner {

}
