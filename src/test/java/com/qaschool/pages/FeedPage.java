package com.qaschool.pages;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$;

public class FeedPage {
    public void verificaRedirectionareDashboard() {
        $(".dashboard-container").shouldBe(Condition.visible); //
    }

    public void creeazaPostareNoua(String textPostare) {
        $("#post-content-textarea").setValue(textPostare); //
        $("#btn-publish-post").click(); //
    }

    public void verificaPostareInFeed(String textAsteptat) {
        $(".feed-posts").shouldHave(Condition.text(textAsteptat)); //
    }
}
