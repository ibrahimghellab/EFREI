package lsiHeritage;

import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        Personne p1 = new Personne("Ghellab","Ibrahim",2006);
        Personne p2 = new Personne();

        p1.afficher();
        System.out.println(p1.calculerAge());

        p2.afficher();
        System.out.println(p2.calculerAge());

        //Pas possible d'appeler les attributs puisqu'il sont privés donc on passe par le constructeur
        p1.setNom("G");
        System.out.println(p1.getNom());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez l'année de naissance : ");
        int anneeNaissance = scanner.nextInt();
        System.out.print("Entrez le salaire : ");
        float salaire = scanner.nextFloat();
        System.out.print("Entrez la prime : ");
        float prime = scanner.nextFloat();
        System.out.print("Entrez le pseudo : ");
        scanner.nextLine();
        String pseudo = scanner.nextLine();
        System.out.println(pseudo);
        Programmeur p = new Programmeur(nom,prenom,anneeNaissance,salaire,prime,pseudo);
        System.out.println("\n");
        System.out.println(">>>>> BIENVENUE ! <<<<<");
        p.afficher();

    }
}
