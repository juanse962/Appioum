package com.perficient.applinks.stepdefinitions;

import com.perficient.applinks.questions.ConnectQuestion;
import com.perficient.applinks.tasks.connect.Connect;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConnectStepDefinitions {
    @When("The user enters the Connect page of the application")
    public void theUserEntersTheConnectPageOfTheApplication() {
        theActorInTheSpotlight().attemptsTo(
                Connect.clickConnect());
    }

    @Then("The user checks the {string} page and today's birthdays are announced")
    public void theUserChecksTheConnectPageAndTodaysBirthdaysAreAnnounced(String title) {
        theActorInTheSpotlight().should(
                seeThat(ConnectQuestion.valuesInConnect(title)));
    }
}
