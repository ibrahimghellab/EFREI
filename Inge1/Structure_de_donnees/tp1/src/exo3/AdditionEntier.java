package exo3;

import exo1.ListeChaine;
import exo1.Maillon;

public class AdditionEntier {
    private static final int BASE = 100_000; // 10^5
    ListeChaine entier1 = new ListeChaine();
    ListeChaine entier2 = new ListeChaine();

    AdditionEntier(String entier1, String entier2) {
        // On découpe par la droite et on pousse en fin :
        // le head devient le bloc le moins significatif (LSB), parfait pour l'addition.
        for (int i = entier1.length(); i > 0; i -= 5) {
            int start = Math.max(0, i - 5);
            int val = Integer.parseInt(entier1.substring(start, i));
            this.entier1.ajouterFin(val);
        }
        for (int i = entier2.length(); i > 0; i -= 5) {
            int start = Math.max(0, i - 5);
            int val = Integer.parseInt(entier2.substring(start, i));
            this.entier2.ajouterFin(val);
        }

        // Si tu veux voir les listes :
        this.entier1.afficherListe();
        this.entier2.afficherListe();
    }

    public ListeChaine add() {
        ListeChaine result = new ListeChaine();

        Maillon p = entier1.getHead(); // LSB
        Maillon q = entier2.getHead(); // LSB
        int carry = 0;

        while (p != null || q != null || carry != 0) {
            int x = (p != null) ? p.getX() : 0;
            int y = (q != null) ? q.getX() : 0;

            long sum = (long) x + y + carry;
            int bloc = (int) (sum % BASE);
            carry = (int) (sum / BASE);

            result.ajouterFin(bloc);

            if (p != null) p = p.getSuivant();
            if (q != null) q = q.getSuivant();
        }

        return result;
    }
}
