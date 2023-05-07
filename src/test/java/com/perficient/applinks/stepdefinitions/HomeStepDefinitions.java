package com.perficient.applinks.stepdefinitions;

import com.perficient.applinks.questions.HomeQuestion;
import com.perficient.applinks.tasks.home.Home;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomeStepDefinitions {
    @When("The user enters the Home page of the application")
    public void theUserEntersTheHomePageOfTheApplication() {
        theActorInTheSpotlight().attemptsTo(
                Home.addNewRecord()
        );
    }

    @Then("The user checks the application for birthdays, announcements and events")
    public void theUserChecksTheApplicationForBirthdaysAnnouncementsAndEvents() {
        theActorInTheSpotlight().should(
                seeThat(HomeQuestion.valuesInProfile()));
    }
}

