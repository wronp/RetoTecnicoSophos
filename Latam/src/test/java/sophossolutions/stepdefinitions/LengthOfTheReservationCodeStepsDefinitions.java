package sophossolutions.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import yourlogoweb.exceptions.ExceptionError;
import yourlogoweb.questions.TheText;
import yourlogoweb.tasks.Navigate;
import yourlogoweb.userinterface.MainPage;
import yourlogoweb.utils.MsgError;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LengthOfTheReservationCodeStepsDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }

    @Given("^The user is in the main page$")
    public void theUserIsInTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.latam.com/es_co/"));
    }


    @When("^The user navigate trough the web page$")
    public void theUserNavigateTroughTheWebPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(Navigate.through());
    }

    @Then("^The user can see the length of the code$")
    public void theUserCanSeeTheLengthOfTheCode() {
        OnStage.theActorInTheSpotlight().should(seeThat(
                TheText.of(MainPage.TEXT_WITH_RESERVATION_CODE_EXAMPLE), is(equalTo(" VBCDGG")))
                .orComplainWith(ExceptionError.class, MsgError.MSG_CODE_ERROR.getMsg()));
    }

}
