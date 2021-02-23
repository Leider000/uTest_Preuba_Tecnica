package co.com.utest.prueba.tecnica.stepdefinitions;

import co.com.utest.prueba.tecnica.model.TestUtestData;
import co.com.utest.prueba.tecnica.tasks.Login;
import co.com.utest.prueba.tecnica.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class testUtestStepDefinitions {

    @Before
    public void setStage () {OnStage.setTheStage(new OnlineCast());}

    @Given("^Leider wants to learn how to use automation tools$")
    public void leiderWantsToLearnHowToUseAutomationTools(List<TestUtestData> testUtestDataList) throws Exception{
        OnStage.theActorCalled("Leider").wasAbleTo(OpenUp.thePage(),
                Login.onThePage(testUtestDataList.get(0).getFirstName(),testUtestDataList.get(0).getLastName(),
                        testUtestDataList.get(0).getEmail(),testUtestDataList.get(0).getMonthOfBirth(),testUtestDataList.get(0).getDayOfBirth(),
                        testUtestDataList.get(0).getAgeOfBirth(),testUtestDataList.get(0).getLeaguajes(),
                        testUtestDataList.get(0).getCity(),testUtestDataList.get(0).getPostalCode(),testUtestDataList.get(0).getCountry(),
                        testUtestDataList.get(0).getDevice(),testUtestDataList.get(0).getModel(),testUtestDataList.get(0).getSystem(),
                        testUtestDataList.get(0).getContra(),testUtestDataList.get(0).getConfirmaContra()));


    }

    @When("^Complete the registration process on the website$")
    public void completeTheRegistrationProcessOnTheWebsite() throws Exception {


    }

    @Then("^Register on the platform$")
    public void registerOnThePlatform() {

    }

}
