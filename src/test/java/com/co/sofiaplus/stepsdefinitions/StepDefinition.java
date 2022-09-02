package com.co.sofiaplus.stepsdefinitions;

import com.co.sofiaplus.models.Credentials;
import com.co.sofiaplus.tasks.Exit;
import com.co.sofiaplus.tasks.Index;
import com.co.sofiaplus.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class StepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("ElPepe");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^He user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://oferta.senasofiaplus.edu.co/sofia-oferta/"));
    }

    @When("^the user enter the credentials$")
    public void theUserEnterTheCredentials(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(credentials));
    }

    @And("^The User use the menu options with a rol$")
    public void HeUseTheMainMenu(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Index.enter(credentials));
    }

    @And("^He go back the index page$")
    public void HeSeeAnotherPage() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://www.senasofiaplus.edu.co/sofia/home/principal.faces"));
    }

    @Then("^User logs out$")
    public void TheUserLogsOff(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Exit.enter(credentials));
    }
}
