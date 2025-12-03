package exo2;

import java.util.List;

public class Start {
    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/bdtpjava";
        String user = "root";
        String pass = "root";

        try (ActionsBD actions = new ActionsBD(url, user, pass)) {
            actions.open();

            System.out.println("=== Tous les programmeurs ===");
            List<Programmeur> tous = actions.getProgrammeurs();
            for (Programmeur p : tous) {
                System.out.println(p); // appelle toString()
            }

            System.out.println("\n=== Programmeurs dont le nom != 'Simpson' ===");
            List<Programmeur> nonSimpson = actions.getProgrammeursNomDifferentDe("Simpson");
            for (Programmeur p : nonSimpson) {
                System.out.println(p);
            }

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
