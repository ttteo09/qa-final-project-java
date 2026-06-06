package com.teodora.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean isValid;

        do {
            isValid = true;
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            // Regula 1: Lungime 6-12 caractere
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                isValid = false;
                continue;
            }

            boolean hasSpace = false;
            boolean hasDigit = false;

            // Regula 2: Bucla FOR obligatorie
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (Character.isWhitespace(c)) {
                    hasSpace = true;
                }
                if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            // Regula 3: Fara spatii
            if (hasSpace) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                isValid = false;
                continue;
            }

            // Regula 4: Minim o cifra
            if (!hasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                isValid = false;
            }

        } while (!isValid);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}
