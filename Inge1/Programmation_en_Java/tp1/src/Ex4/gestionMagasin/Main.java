package Ex4.gestionMagasin;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userInput;
        Magasin m = new Magasin();
        m.ajouterProduit(new Produit(1, "Pain", 1.2f, 50));
        m.ajouterProduit(new Produit(2, "Lait", 0.9f, 100));
        m.ajouterProduit(new Produit(3, "Beurre", 2.5f, 30));
        m.ajouterProduit(new Produit(4, "Fromage", 3.8f, 20));
        m.ajouterProduit(new Produit(5, "Yaourt", 0.7f, 80));
        m.ajouterProduit(new Produit(6, "Pâtes", 1.1f, 60));
        m.ajouterProduit(new Produit(7, "Riz", 1.3f, 70));
        m.ajouterProduit(new Produit(8, "Sucre", 1.0f, 90));
        m.ajouterProduit(new Produit(9, "Farine", 1.5f, 40));
        m.ajouterProduit(new Produit(10, "Huile", 4.2f, 25));
        m.ajouterProduit(new Produit(11, "Poulet", 6.5f, 15));
        m.ajouterProduit(new Produit(12, "Bœuf", 9.9f, 10));
        m.ajouterProduit(new Produit(13, "Poisson", 7.5f, 12));
        m.ajouterProduit(new Produit(14, "Pomme", 2.0f, 100));
        m.ajouterProduit(new Produit(15, "Banane", 1.8f, 80));
        m.ajouterProduit(new Produit(16, "Orange", 2.2f, 60));
        m.ajouterProduit(new Produit(17, "Tomate", 2.5f, 70));
        m.ajouterProduit(new Produit(18, "Carotte", 1.7f, 50));
        m.ajouterProduit(new Produit(19, "Eau", 0.5f, 200));
        m.ajouterProduit(new Produit(20, "Jus d’orange", 2.9f, 40));
        Client c = new Client(1, "client1", "client1@gmail.com");
        Panier p = new Panier();
        do {

            System.out.println("--- Menu Magasin --- \n1. Afficher les produits disponibles \n2. Ajouter un produit au panier\n3. Afficher le panier\n4. Passer la commande\n5. Quitter");
            Scanner s = new Scanner(System.in);
            userInput = s.nextLine();
            try {

                switch (userInput) {
                    case "1":
                        m.afficherProduitsDisponibles();
                        break;
                    case "2":
                        m.afficherProduitsDisponibles();
                        System.out.println("Entrer le numéro du produit que vous souhaiter ajouter au panier");
                        userInput = s.nextLine();
                        p.ajouterProduit(m.getProduits().get(Integer.parseInt(userInput)-1));
                        break;
                    case "3":
                        System.out.println(p.getProduits().toString());
                        p.afficherPanier();
                        break;
                    case "4":
                        Commande com = new Commande(1, c, p.getProduits());
                        System.out.println("Vous venez de passer cette commande : ");
                        com.afficherDetailsCommande();
                        for(Produit pr : p.getProduits()){
                            p.supprimerProduit(pr);
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!userInput.equals("5"));
    }
}
