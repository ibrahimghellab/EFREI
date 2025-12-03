package exo2;

import java.time.LocalDateTime;

public class Maillon {
    private String valeur;
    private LocalDateTime dateDeModification;
    private Maillon precedent;
    private Maillon suivant;

    public LocalDateTime getDateDeModification() {
        return dateDeModification;
    }

    public void setDateDeModification(LocalDateTime dateDeModification) {
        this.dateDeModification = dateDeModification;
    }

    Maillon(String valeur){
        this.valeur = valeur;
        this.dateDeModification = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Maillon{" +
                "valeur='" + valeur + '\'' +
                ", date de Modif=" + dateDeModification + '\'' +
                '}';
    }

    public Maillon getSuivant() {
        return suivant;
    }

    public void setSuivant(Maillon suivant) {
        this.suivant = suivant;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Maillon getPrecedent() {
        return precedent;
    }

    public void setPrecedent(Maillon precedent) {
        this.precedent = precedent;
    }
}
