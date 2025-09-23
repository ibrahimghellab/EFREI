package Ex4.gestionMagasin;

import java.util.ArrayList;
import java.util.Objects;

public class Magasin {
    private ArrayList<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit produit){
        produits.add(produit);
    }

    public void afficherProduitsDisponibles(){
        for(Produit p : produits){
            p.afficherDetails();
        }
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void trouverProduitParNom(String nom){
        for(Produit p : produits){
            if(Objects.equals(p.getNom(), nom)){
                p.afficherDetails();
            }
        }
    }


}
