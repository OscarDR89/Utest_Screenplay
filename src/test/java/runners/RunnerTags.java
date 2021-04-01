package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/utest.Feature",
        tags = "@historia",
        glue = "com.utest.prueb1.utestStepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}