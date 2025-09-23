package Ex4.gestionMagasin;

public class Produit {
    private int id;
    private String nom;
    private float prix;
    private int quantite;


    Produit(int id, String nom, float prix, int quantite){
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }


    public void afficherDetails(){
        System.out.println("Id : "+id+"\nNom : "+nom+"\nPrix : "+prix+"\nQuantité : "+quantite);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
