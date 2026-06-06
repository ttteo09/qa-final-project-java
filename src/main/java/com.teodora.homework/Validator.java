public class Validator {

    // Metoda asta verifică email-ul
    public static boolean isEmailValid(String email) {
        if (email == null) return false;
        // Trebuie să aibă @ și să se termine în .com
        return email.contains("@") && email.endsWith(".com");
    }

    // Metoda asta verifică parola
    public static boolean isPasswordStrong(String password) {
        // Dacă e mai scurtă de 8 caractere, e slabă direct
        if (password == null || password.length() < 8) {
            return false;
        }

        // Căutăm o cifră: luăm parola la rând, literă cu literă
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true; // Am găsit o cifră, e OK!
            }
        }
        return false; // Am verificat tot și n-am găsit nicio cifră
    }
}