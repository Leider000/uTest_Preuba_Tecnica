package co.com.utest.prueba.tecnica.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/testUtest.feature",
    tags= "@stories",
    glue = "co.com.utest.prueba.tecnica.stepdefinitions",
    snippets = SnippetType.CAMELCASE
)

public class RunnerTags {

}
