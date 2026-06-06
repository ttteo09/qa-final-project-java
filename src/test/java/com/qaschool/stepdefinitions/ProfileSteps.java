package com.qaschool.stepdefinitions;

import com.qaschool.pages.ProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
    private final ProfilePage profilePage = new ProfilePage();

    @When("utilizatorul acceseaza sectiunea profil")
    public void utilizatorulAcceseazaSectiuneaProfil() {
        profilePage.acceseazaSectiuneaProfil(); //
    }

    @Then("emailul utilizatorului trebuie sa fie afisat corect")
    public void emailulUtilizatoruluiTrebuieSaFieAfisatCorect() {
        profilePage.verificaEmailProfil(); //
    }
}
