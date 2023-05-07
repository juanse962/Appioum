package com.perficient.applinks.stepdefinitions;

import com.perficient.applinks.questions.CertificationsHobbiesSkillsQuestion;
import com.perficient.applinks.tasks.Login;
import com.perficient.applinks.tasks.profile.Profile;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProfileStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user enters the application and displays the profile section")
    public void theUserEntersTheApplicationAndDisplaysTheProfileSection(DataTable dataCredentials) {
        theActorCalled("Sebastian").attemptsTo(Login.loginWithAccount(dataCredentials));
    }

    @When("The user add certification hobbies and skills")
    public void theUserAddCertificationHobbiesAndSkills(DataTable dataCertificationHobbieAndSkill) {
        theActorInTheSpotlight().attemptsTo(
                Profile.addNewRecord(dataCertificationHobbieAndSkill)
        );
    }

    @Then("The user verify his (.*), (.*) and (.*)$")
    public void theUserVerifyHisCertificateHobbiesAndSkill(String cert, String hobbie, String skill) {
        theActorInTheSpotlight().should(
                seeThat(CertificationsHobbiesSkillsQuestion.valuesInProfile(cert, hobbie, skill))
        );
    }
}

