package exo3;

import exo1.ListeChaine;
import exo1.Maillon;

public class Main {
    public static void main(String[] args){

        AdditionEntier a = new AdditionEntier("12345678970","987654321788");


//        ListeChaine resultat = a.add();
//
//        Maillon head = resultat.getHead();
//        Maillon prev = null;
//        Maillon next;
//
//        while (head != null) {
//            next = head.getSuivant();
//            head.setSuivant(prev);
//            prev = head;
//            head = next;
//        }
//
//        resultat.setHead(prev);
//
//        Maillon courant = resultat.getHead();
//        StringBuilder sb = new StringBuilder();
//
//        if (courant != null) {
//            sb.append(courant.getX());
//            courant = courant.getSuivant();
//        }
//
//        while (courant != null) {
//            sb.append(String.format("%05d", courant.getX()));
//            courant = courant.getSuivant();
//        }
//        System.out.print("Résultat (liste) : ");
//        resultat.afficherListe();
//        System.out.println("Résultat : " + sb.toString());
    }
}
