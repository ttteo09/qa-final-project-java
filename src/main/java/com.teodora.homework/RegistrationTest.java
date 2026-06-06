public class RegistrationTest {
    public static void main(String[] args) {
        System.out.println("--- TESTARE VALIDATOR ---");

        // Testăm email-ul
        String emailCorect = "contact@test.com";
        String emailGresit = "contact.test.ro";

        System.out.println("Email bun (" + emailCorect + "): " + Validator.isEmailValid(emailCorect));
        System.out.println("Email prost (" + emailGresit + "): " + Validator.isEmailValid(emailGresit));

        // Testăm parola
        String parolaTare = "Boss12345";
        String parolaSlaba = "doartext";

        System.out.println("\nParolă tare (" + parolaTare + "): " + Validator.isPasswordStrong(parolaTare));
        System.out.println("Parolă slabă (" + parolaSlaba + "): " + Validator.isPasswordStrong(parolaSlaba));
    }
}