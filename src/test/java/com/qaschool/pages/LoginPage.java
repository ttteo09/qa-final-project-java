package com.qaschool.pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final String BASE_UI_URL = "https://apps.qualiadept.eu/hapifyme";

    public void deschidePaginaLogin() {
        open(BASE_UI_URL + "/login");
    }

    public void introduDateConectare(String username, String password) {
        $("#username").setValue(username);
        $("#password").setValue(password);
        $("#login-submit-btn").click();
    }
}