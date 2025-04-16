package com.flipkart.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = {"com.flipkart.steps"},
        plugin = {
                "pretty",                                          // Console output
                "html:target/cucumber-reports/cucumber-html.html", // Cucumber HTML
                "json:target/cucumber-reports/cucumber.json",      // Cucumber JSON
                "junit:target/cucumber-reports/cucumber.xml",      // Optional JUnit XML
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" // Allure Report
        },
        monochrome = true
)
public class TestCSDFlipkartRunner {
}
