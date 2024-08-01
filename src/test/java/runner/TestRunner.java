package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

// import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
        glue = "steps",
        plugin = { "pretty", "html:target/cucumber-reports" })

public class TestRunner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}

// To run and filter by Tag, depending on which Step we want to run in the feature file:
// gradle test -Dcucumber.filter.tags="@NameTag"

// Also to skip a test we can use the following command:
// gradle test -Dcucumber.filter.tags="not @NameTag"

// To run only some specific tags, select the following command:
// gradle test -Dcucumber.filter.tags="@NameTag or @OtherNameTag"