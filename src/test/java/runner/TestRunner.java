package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import java.io.File;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"seleniumgluecode"},
        plugin = { "pretty", "html:resources/cucumber-report/cucumber-reports",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
        //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapater:resources/cucumber-report/report.html"}
)



public class TestRunner {
}
