package com.qaschool.api.utils;

public class DataGenerator {

    /**
     * Generează un email unic bazat pe timestamp-ul curent al sistemului.
     * Astfel ne asigurăm că testul de Register poate fi rulat la nesfârșit fără erori de duplicat.
     */
    public static String generateUniqueEmail() {
        long timestamp = System.currentTimeMillis();
        return "teodora_test_" + timestamp + "@hapifyme.com";
    }

    /**
     * Generează un nume fictiv pentru testul de Update Profile.
     */
    public static String generateRandomName() {
        return "Teodora_" + System.currentTimeMillis() % 1000;
    }
}