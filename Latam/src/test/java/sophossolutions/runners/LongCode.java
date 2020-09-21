package sophossolutions.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/sophossolutions/features/long_code.feature",
                snippets = SnippetType.CAMELCASE,
                glue = "sophossolutions/stepdefinitions")
public class LongCode {
}
