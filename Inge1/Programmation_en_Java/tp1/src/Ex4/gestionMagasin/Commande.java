package Ex4.gestionMagasin;

import java.util.ArrayList;

public class Commande {
    private int idCommande;
    private Client client;
    private  ArrayList<Produit> produitsCommandes;
    private  float total;

    Commande(int idCommande, Client client,ArrayList<Produit> produitsCommandes){
        this.idCommande = idCommande;
        this.produitsCommandes = produitsCommandes;
        this.client = client;
        for(Produit p : produitsCommandes){
            total+= p.getPrix();
        }
    }

    public void afficherDetailsCommande(){

        System.out.println("Id : "+idCommande+"\nClient : ");
        client.afficherDetails();
        for(Produit p : produitsCommandes){
            p.afficherDetails();
        }
        System.out.println("Total : "+total);


    }

}
