package lsiHeritage;

public class Programmeur extends Personne{
    private float prime;
    private float salaire;
    private String pseudo;

    public Programmeur(){
        super();
        this.prime = 0f;
        this.salaire = 0f;
        this.pseudo = "Pas de pseudo";
    }

    public Programmeur(float prime, float salaire) {
        super();
        this.prime = prime;
        this.salaire = salaire;
    }

    public Programmeur(float prime, float salaire, String pseudo) {
        super();
        this.prime = prime;
        this.salaire = salaire;
        this.pseudo = pseudo;
    }

    public Programmeur(String nom, String prenom, int anNaissance, float prime, float salaire, String pseudo) {
        super(nom, prenom, anNaissance);
        this.prime = prime;
        this.salaire = salaire;
        this.pseudo = pseudo;
    }

    //Question 3

//    public void afficher(){
//        super.afficher();
//        System.out.println(", Prime : " + this.prime + ", Salaire : " + this.salaire + ", Pseudo : " + this.pseudo);
//    }

    public float getSalaire(){
        return this.salaire + this.prime;
    }

    // Question 4
    // La méthode toString() sert a pouvoir utiliser un objet dans un affichage par exemple System.out.println(objet) en gros retourner une chaine de caractere


    @Override
    public String toString() {
        return ("Prime : " + this.prime + ", Salaire : " + this.salaire + ", Pseudo : " + this.pseudo);
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println(this);
    }


    }
