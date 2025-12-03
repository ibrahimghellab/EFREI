package exo2;

public class Programmeur {
    private final String nom;
    private final String prenom;
    private final int anNaissance;
    private final int salaire;
    private final int prime;
    private final String pseudo;

    public Programmeur(String nom, String prenom, int anNaissance, int salaire, int prime, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        this.salaire = salaire;
        this.prime = prime;
        this.pseudo = pseudo;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAnNaissance() { return anNaissance; }
    public int getSalaire() { return salaire; }
    public int getPrime() { return prime; }
    public String getPseudo() { return pseudo; }

    @Override
    public String toString() {
        return String.format("%s %s (%d) - Salaire: %d, Prime: %d, Pseudo: %s",
                prenom, nom, anNaissance, salaire, prime, pseudo);
    }
}