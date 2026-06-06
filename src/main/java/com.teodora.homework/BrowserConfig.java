package com.teodora.homework;

public class BrowserConfig {
    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    // Constructor 1: Principal (complet)
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    // Constructor 2: Apelează constructorul 1 (implicit headless = false)
    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    // Constructor 3: Apelează constructorul 2 (implicit version = "latest")
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest");
    }

    // Metoda Factory Statică
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    // Metoda de afișare pentru consolă
    public void afiseazaConfig() {
        System.out.println("Browser: " + browser + ", Version: " + version + ", Headless: " + isHeadless);
    }
}