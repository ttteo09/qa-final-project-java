package com.qaschool.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    @Before
    public void setUp() {
        // 1. Configuram Selenide sa ruleze HEADLESS pe serverele GitHub Actions (fara interfata grafica)
        Configuration.headless = true;

        // 2. Setam browserul pe Chrome
        Configuration.browser = "chrome";

        // 3. Adaugam argumente extra pentru stabilitate maxima in cloud (sa nu crape memoria pe Linux)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        Configuration.browserCapabilities = options;

        // 4. Asteptare dinamica de nota 10 (Selenide va astepta pana la 10 secunde ca elementele sa apara)
        Configuration.timeout = 10000;
    }

    @After
    public void tearDown() {
        // Inchidem browserul curat dupa fiecare scenariu de test
        Selenide.closeWebDriver();
    }
}