package lsiHeritage;

import java.time.LocalDateTime;

public class Personne {
    private String nom;
    private String prenom;
    private int anNaissance;

    public Personne(String nom, String prenom, int anNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
    }

    public Personne (){
        this.nom = "Pas de nom";
        this.prenom = "Pas de prenom";
        this.anNaissance = 0;
    }

    public int calculerAge(){
        return LocalDateTime.now().getYear() - anNaissance;
    }

    public void afficher(){
        System.out.println("Nom : " + this.nom + ", Prénom : " + this.prenom + ", Age : " + this.anNaissance);
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
}
