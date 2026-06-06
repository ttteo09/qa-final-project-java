package com.qaschool.pages;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public void acceseazaSectiuneaProfil() {
        $("#menu-profile-link").click(); //
    }

    public void verificaEmailProfil() {
        $("#profile-email-input").shouldNotBe(Condition.empty); //
    }
}
