// Fișier: User.java
public class User {
    // Pasul 1: Numele utilizatorului (privat, String)
    private String username;

    // Pasul 2: Contorul static (privat, static, pornește de la 0)
    private static int userCount = 0;

    // Pasul 3: Constructorul - aici se face "clicul" pe contor
    public User(String username) {
        this.username = username;
        userCount++; // Creștem numărul total de utilizatori
    }

    // Pasul 4: Metoda statică să vedem numărul total
    public static int getUserCount() {
        return userCount;
    }
}