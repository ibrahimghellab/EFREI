package Ex1et2;

import java.time.LocalDateTime;

public class Personne {

    static int nbPersonne = 0;

    private String nom;
    private String prenom;
    private int anNaissance;

    Personne(){
        this.nom = "Potter";
        this.prenom = "Harry";
        this.anNaissance = 1980;
        nbPersonne++;
        afficherNbPers();
    }

    Personne(String nom, String prenom, int anNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        nbPersonne++;
        afficherNbPers();
    }
    Personne(String prenom, int anNaissance){
        this.nom = "Inconnu";
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        nbPersonne++;
        afficherNbPers();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnNaissance() {
        return anNaissance;
    }

    public void setAnNaissance(int anNaissance) {
        this.anNaissance = anNaissance;
    }


    public int calculerAge(){
        return LocalDateTime.now().getYear()-this.anNaissance;
    }

    public void afficherInfos(){
        System.out.println("Nom: "+this.nom+"\nPrénom: "+this.prenom+"\nÂge: "+this.anNaissance );
    }

    public void mange(String nourriture){
        System.out.println(this.nom + " " + this.prenom + " mange un/une " + nourriture);
    }


    public void afficherNbPers(){
        System.out.println("Il y a "+ nbPersonne + " personnes crées");
    }


    public static void main(String[] args) {
        // Création d'une instance de la classe Personne
        Personne personne1 = new Personne("Dupont", "Jean",2004);
        Personne personne2 = new Personne("Ibrahim", 2006);
        Personne personne3 = new Personne();

        //Test getter et setter
        System.out.println("Getter et Setter");
        System.out.println("Avant modification : ");
        System.out.println(personne1.getNom());
        System.out.println(personne1.getPrenom());
        System.out.println(personne1.getAnNaissance());

        personne1.setNom("Dupond");
        personne1.setPrenom("Jeanne");
        personne1.setAnNaissance(1994);

        System.out.println("Après modification : ");
        System.out.println(personne1.getNom());
        System.out.println(personne1.getPrenom());
        System.out.println(personne1.getAnNaissance());

        System.out.println("Test mange()");
        personne1.mange("Sandwich");

        System.out.println("Test calculerAge()");
        System.out.println(personne1.calculerAge());

        System.out.println("Test afficherInfos()");
        personne1.afficherInfos();

    }

}
