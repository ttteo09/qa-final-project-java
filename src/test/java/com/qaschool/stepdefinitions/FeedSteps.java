package com.qaschool.stepdefinitions;

import com.qaschool.pages.FeedPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeedSteps {
    private final FeedPage feedPage = new FeedPage();

    @Then("utilizatorul este redirectionat pe pagina principala")
    public void utilizatorulEsteRedirectionatPePaginaPrincipala() {
        feedPage.verificaRedirectionareDashboard(); //
    }

    @When("utilizatorul creeaza o postare noua cu textul {string}")
    public void utilizatorulCreeazaOPostareNouaCuTextul(String textPostare) {
        feedPage.creeazaPostareNoua(textPostare); //
    }

    @Then("postarea trebuie sa fie vizibila pe feed")
    public void postareaTrebuieSaFieVizibilaPeFeed() {
        feedPage.verificaPostareInFeed("Automatizare proiect final de 40 puncte"); //
    }
}