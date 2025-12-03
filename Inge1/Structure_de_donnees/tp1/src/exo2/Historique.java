package exo2;

public class Historique {
    Maillon current;
    int nb;


    Historique(){
        current = null;
    }

    Historique(String s){
        current = new Maillon(s);
        current.setPrecedent(current);
        current.setSuivant(current);
    }


    public void ajouterElement(String s){
        if(current == null){
            current = new Maillon(s);
            current.setSuivant(current);
            current.setPrecedent(current);
        }else{
            Maillon newMaillon = new Maillon(s);
            newMaillon.setSuivant(current.getSuivant());
            newMaillon.setPrecedent(current);

            current.getSuivant().setPrecedent(newMaillon);
            current.setSuivant(newMaillon);

            current = newMaillon;
//            System.out.println("Prédédent : " +current.getPrecedent());
//            System.out.println("Courant : " + current);
//            System.out.println("Suivant : " + current.getSuivant());



        }
    }


    public Maillon retirerELement(){
        if(current == null){
            return null;
        }
        if(current.getSuivant() == current && current.getPrecedent() == current){
            Maillon retour = current;
            current = null;
            return retour;
        }else{

            System.out.println(current.getSuivant());
            current.getPrecedent().setSuivant(current.getSuivant());
            current.getSuivant().setPrecedent(current.getPrecedent());
            Maillon retour = current;
            current = current.getPrecedent();
            return retour;
        }
    }


    public void avancer(){
        if(current == null){
            System.out.println("Liste vide : rien dans l'historique ");
        }
        if(current.getSuivant() == current && current.getPrecedent() == current){
            System.out.println("Un seul élément dans l'historique");
        }else{
            current = current.getSuivant();
            System.out.println(current);
        }
    }

    @Override
    public String toString() {
        if (current != null){
            return "L'élément courant est " + current.toString();
        }else{
            return "Plus d'élement";
        }
    }

    public void reculer(){
        if(current == null){
            System.out.println("Liste vide : rien dans l'historique ");
        }
        if(current.getSuivant() == current && current.getPrecedent() == current){
            System.out.println("Un seul élément dans l'historique");
        }else{
            current = current.getPrecedent();
            System.out.println(current);
        }
    }


}
