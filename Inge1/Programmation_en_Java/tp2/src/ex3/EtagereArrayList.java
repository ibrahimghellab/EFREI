package ex3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class EtagereArrayList {
    private int code;
    private String domaine;
    private int capacite;
    private ArrayList<Livre> livres = new ArrayList<>();

    public EtagereArrayList(int code, String domaine, int capacite) {
        this.code = code;
        this.domaine = domaine;
        this.capacite = capacite;
    }

    public void ajouterLivre(Livre livre){
       livres.add(livre);

    }

    public void supprimerLivre(int code){
        for(Livre l : livres){
            if(l.getCode() == code){
                livres.remove(l);
                break;
            }
        }
    }

    public int sommePages(){
        int somme = 0;
       for(Livre l : livres){
           somme += l.getNbPages();
       }
        return somme;
    }

    public int chercherLivreParTitre(String titre){
        int indice = -1;
        for(int i = 0; i < livres.size(); i++){
            if(Objects.equals(titre, livres.get(i).getTitre())){
                indice = i;
            }
            i++;
        }
        return indice;
    }

    public void chercherPetitsLivres(int seuil){
       for(Livre l : livres) {
           if (l.getNbPages() < seuil) {
               System.out.println(l);
           }
       }

    }

    public void afficherNouveauxLivres(int anneeActuelle){
        for(Livre l : livres){
            if(l.getAnneeEdition() == anneeActuelle){
                System.out.println("Titre : " + l.getTitre() + ", Code : " + l.getCode() );
            }
        }
    }

    public void changerNbPages(int code, int nbPages){
        for(Livre l : livres){
            if(l.getCode() == code){
                l.setNbPages(nbPages);
            }
        }
    }

    public void afficherLivres(){
        for (Livre l : livres){
            System.out.println(l);
        }
    }

    public String[] chercherTitresParAuteur(String auteur){

        ArrayList<String> titre = new ArrayList<>();

        for(Livre l : livres){
            if(l.getAuteur().equals(auteur)){
                titre.add(l.getTitre());
            }
        }

        return (String[]) titre.toArray();
    }

    public void sort(){
        livres.sort(Comparator.comparingInt(Livre::getNbPages));
    }


}
