package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //raporların daha okunaklı olması için
                "html:target/default-cucumber-reports07.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
//                "utilities.formatter.prettyReports:target/cucumber-pretty-reports",
//                "rerun:target/rerun.txt"
        },
        monochrome = true, //raporları consolda daha okunaklı olması için
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@loginPositive or @loginNegative or @product or @searchproduct",
        dryRun = true

)

public class RunnerUI {
}
