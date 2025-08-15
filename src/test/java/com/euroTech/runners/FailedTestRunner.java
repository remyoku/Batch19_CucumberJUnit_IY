package com.euroTech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-html-reports.html"
        },
        features = "@target/rerun.txt",
        glue = "com/euroTech/step_definitions"


)

public class FailedTestRunner {
}
