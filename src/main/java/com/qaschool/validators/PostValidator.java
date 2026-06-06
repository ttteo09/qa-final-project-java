package com.qaschool.validators;

public class PostValidator {

    public String getPostStatus(String postBody) {
        // Verificăm dacă textul lipsește sau e gol
        if (postBody == null || postBody.trim().isEmpty()) {
            return "ERROR_EMPTY";
        }

        // Verificăm dacă textul depășește 250 de caractere
        if (postBody.length() > 250) {
            return "ERROR_TOO_LONG";
        }

        // Verificăm dacă conține cuvântul "politică" (indiferent de litere mari/mici)
        if (postBody.toLowerCase().contains("politică")) {
            return "ERROR_FORBIDDEN";
        }

        // Dacă a trecut de toate filtrele, postarea e validă
        return "POST_VALID";
    }
}