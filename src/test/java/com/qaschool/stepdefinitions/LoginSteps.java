package com.qaschool.stepdefinitions;

import com.qaschool.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
    private final LoginPage loginPage = new LoginPage();

    @Given("utilizatorul este pe pagina de autentificare")
    public void utilizatorulEstePePaginaDeAutentificare() {
        loginPage.deschidePaginaLogin();
    }

    @When("utilizatorul introduce datele de conectare valide")
    public void utilizatorulIntroduceDateleDeConectareValide() {
        loginPage.introduDateConectare("admin_test", "Password123!");
    }
}