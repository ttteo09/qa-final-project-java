public class Platforma {
    public static void main(String[] args) {
        // Verificăm cât e contorul la început (ar trebui să fie 0)
        System.out.println("Utilizatori la început: " + User.getUserCount());

        // Creăm 3 utilizatori diferiți
        User u1 = new User("teodora");
        User u2 = new User("ioana");
        User u3 = new User("neagu");

        // Acum contorul ar trebui să fie 3, pentru că am creat 3 obiecte
        System.out.println("Utilizatori în total: " + User.getUserCount());
    }
}