package ex3;

import java.util.Objects;

public class Etagere {
    private int code;
    private String domaine;
    private int capacite;
    private Livre[] livres;

    public Etagere(int code, String domaine, int capacite) {
        this.code = code;
        this.domaine = domaine;
        this.capacite = capacite;
        livres = new Livre[capacite];
    }

    public void ajouterLivre(Livre livre){
        int i = 0;
        while(livres[i] != null){

            i++;
            if(livres.length == i){
                return;
            }
        }
        livres[i] = livre;

    }

    public void supprimerLivre(int code){

        for(int i = 0; i < livres.length; i++){
            if(livres[i] != null && livres[i].getCode() == code ){
                for(int j = i; j < livres.length - 1; j++){
                    livres[j] = livres[j+1];
                }
                livres[livres.length - 1] = null;
                return;
            }
        }
    }

    public int sommePages(){
        int somme = 0;
        int i = 0;
        while (livres[i]!=null){
            somme+= livres[i].getNbPages();
            i++;
        }
        return somme;
    }

    public int chercherLivreParTitre(String titre){
        int indice = -1;
        int i = 0;
        while (livres[i]!=null){
            if(Objects.equals(titre, livres[i].getTitre())){
                indice = i;
            }
            i++;
        }
        return indice;
    }

    public void chercherPetitsLivres(int seuil){
        int i = 0;
        while (livres[i]!=null){
            if(livres[i].getNbPages() < seuil){
                System.out.println(livres[i]);
            }
            i++;
        }

    }

    public void afficherNouveauxLivres(int anneeActuelle){
        int i = 0;
        while (livres[i]!=null){
            if(livres[i].getAnneeEdition() == anneeActuelle){
                System.out.println("Titre : " + livres[i].getTitre() + ", Code : " + livres[i].getCode() );
            }
            i++;
        }
    }

    public void changerNbPages(int code, int nbPages){
        int i = 0;
        while (livres[i]!=null){
            if(livres[i].getCode() == code){
                livres[i].setNbPages(nbPages);
            }
            i++;
        }
    }

    public void afficherLivres(){
        int i = 0;
        while (livres[i]!=null){
            System.out.println(livres[i]);
            i++;
        }
    }

    public String[] chercherTitresParAuteur(String auteur){

        String[] temp = new String[livres.length];
        int nbLivre = 0;
        int i = 0;
        while (livres[i]!=null) {
            if (livres[i].getAuteur().equals(auteur)) {
                temp[nbLivre] = livres[i].getAuteur();
                nbLivre++;
            }
        }

        String[] authors = new String[nbLivre];

        for(i = 0; i < nbLivre; i++){
            authors[i] = temp[i];
        }
        return authors;
    }

    public  void sort(){
        for(int i = 0; i < livres.length; i++){
            int min = i;
            for(int j = i+1; j < livres.length; j++){
                if(livres[min].getNbPages() > livres[j].getNbPages()){
                    min = j;
                }
            }
            Livre temp = livres[i];
            livres[i] = livres[min];
            livres[min] = temp;
        }

    }




    public static void main(String[] args){
        Etagere e = new Etagere(4,"P",3);
        e.ajouterLivre(new Livre("1",2,"moi",2,2011));
        e.ajouterLivre(new Livre("1",3,"moi",2,2012));
        e.ajouterLivre(new Livre("1",4,"moi",2,2013));
        e.supprimerLivre(3);
        System.out.println(e.livres[1]);
    }



}
