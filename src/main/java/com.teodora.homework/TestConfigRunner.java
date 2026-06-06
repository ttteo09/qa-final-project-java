package com.teodora.homework;

public class TestConfigRunner {
    public static void main(String[] args) {
        System.out.println("--- Testare Homework Session 8 ---");

        // 1. Folosim constructorul cu toți parametrii
        BrowserConfig config1 = new BrowserConfig(BrowserType.FIREFOX, "123.0", true);
        config1.afiseazaConfig();

        // 2. Folosim constructorul cu 2 parametri
        BrowserConfig config2 = new BrowserConfig(BrowserType.EDGE, "122.0");
        config2.afiseazaConfig();

        // 3. Folosim constructorul cu 1 parametru
        BrowserConfig config3 = new BrowserConfig(BrowserType.CHROME);
        config3.afiseazaConfig();

        // 4. Folosim metoda Factory
        BrowserConfig configFactory = BrowserConfig.createDefaultChromeConfig();
        configFactory.afiseazaConfig();
    }
}