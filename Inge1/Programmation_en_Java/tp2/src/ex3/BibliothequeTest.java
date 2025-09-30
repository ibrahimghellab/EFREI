package ex3;

public class BibliothequeTest {

    public static void main (String[] args){

        System.out.print("Test List");
        System.out.println();

        Etagere e1 = new Etagere(1,"Chimie",4);
        Etagere e2 = new Etagere(2,"Informatique",5);
        e1.ajouterLivre(new Livre("La chimie organique",201,"John McMurry",1200,2019));
        e1.ajouterLivre(new Livre("Introduction à la chimie analytique",202,"Daniel C. Harris",800,2021));
        e1.ajouterLivre(new Livre("Chimie générale",203,"Raymond Chang",1000,2018));
        e2.ajouterLivre(new Livre("Introduction aux algorithmes",301,"Thomas H. Cormen",1300,2020));
        e2.ajouterLivre(new Livre("Design Patterns",302,"Erich Gamma",400,1994));
        e2.ajouterLivre(new Livre("Java pour les débutants",303,"Herbert Schildt",700,2019));

        System.out.println("Affichage des etagere : ");
        e1.afficherLivres();
        e2.afficherLivres();

        System.out.println();
        System.out.println("Affichage de la somme des pages : ");

        System.out.println(e1.sommePages());
        System.out.println(e2.sommePages());


        System.out.println();
        System.out.println("Affichage de l'indice du livre la chimie organique : ");

        System.out.println(e1.chercherLivreParTitre("La chimie organique"));

        System.out.println();
        System.out.println("Affichage des petits livres : ");

        e1.chercherPetitsLivres(1001);
        e2.chercherPetitsLivres(1001);

        System.out.println();
        System.out.println("Affichage des nouveaux livres : ");

        e1.afficherNouveauxLivres(2021);
        e2.afficherNouveauxLivres(2020);

        System.out.println();
        System.out.println("Changement de nombre de pages : ");

        e1.changerNbPages(201,1000);
        e1.afficherLivres();

        e2.changerNbPages(301,1000);
        e2.afficherLivres();


        System.out.println();
        System.out.println("Suppresion de livres : ");

        e1.supprimerLivre(201);
        e2.supprimerLivre(301);

        e1.afficherLivres();
        e2.afficherLivres();



        System.out.println();
        System.out.print("Test arrayList");
        System.out.println();

        EtagereArrayList eal1 = new EtagereArrayList(1,"Chimie",4);
        EtagereArrayList eal2 = new EtagereArrayList(2,"Informatique",5);
        eal1.ajouterLivre(new Livre("La chimie organique",201,"John McMurry",1200,2019));
        eal1.ajouterLivre(new Livre("Introduction à la chimie analytique",202,"Daniel C. Harris",800,2021));
        eal1.ajouterLivre(new Livre("Chimie générale",203,"Raymond Chang",1000,2018));
        eal2.ajouterLivre(new Livre("Introduction aux algorithmes",301,"Thomas H. Cormen",1300,2020));
        eal2.ajouterLivre(new Livre("Design Patterns",302,"Erich Gamma",400,1994));
        eal2.ajouterLivre(new Livre("Java pour les débutants",303,"Herbert Schildt",700,2019));

        System.out.println("Affichage des etagere : ");
        eal1.afficherLivres();
        eal2.afficherLivres();

        System.out.println();
        System.out.println("Affichage de la somme des pages : ");

        System.out.println(eal1.sommePages());
        System.out.println(eal2.sommePages());


        System.out.println();
        System.out.println("Affichage de l'indice du livre la chimie organique : ");

        System.out.println(eal1.chercherLivreParTitre("La chimie organique"));

        System.out.println();
        System.out.println("Affichage des petits livres : ");

        eal1.chercherPetitsLivres(1001);
        eal2.chercherPetitsLivres(1001);

        System.out.println();
        System.out.println("Affichage des nouveaux livres : ");

        eal1.afficherNouveauxLivres(2021);
        eal2.afficherNouveauxLivres(2020);

        System.out.println();
        System.out.println("Changement de nombre de pages : ");

        eal1.changerNbPages(201,1000);
        eal1.afficherLivres();

        eal2.changerNbPages(301,1000);
        eal2.afficherLivres();


        System.out.println();
        System.out.println("Suppresion de livres : ");

        eal1.supprimerLivre(201);
        eal2.supprimerLivre(301);

        eal1.afficherLivres();
        eal2.afficherLivres();




    }




}
