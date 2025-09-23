package Ex4.gestionMagasin;

import java.util.ArrayList;

public class Panier {
    private ArrayList<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit produit){
        produits.add(produit);

    }
    public void supprimerProduit(Produit produit){
        produits.remove(produit);
    }
    public void afficherPanier(){
        for(Produit produit : produits){
            produit.afficherDetails();
            System.out.println();
        }
    }
    public float calculerTotal(){
        float prix = 0f;
        for(Produit produit : produits){
            prix+=produit.getPrix();
        }
        return prix;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }
}
