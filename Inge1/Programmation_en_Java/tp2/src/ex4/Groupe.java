package ex4;

import java.util.ArrayList;
import java.util.Comparator;

public class Groupe {
    ArrayList<Etudiant> etudiants = new ArrayList<>();

    public void afficherEtudiants(){
        for(Etudiant e : etudiants){
            System.out.println(e);
        }
    }

    public void sort(){
        etudiants.sort(Comparator.comparing(Etudiant::getAge));
    }

    public String findSpecialiteByNumEtudiant(int numEtudiant){
        for(Etudiant e : etudiants){
            if(e.getNumEtudiant() == numEtudiant){
                return e.getSpecialite();
            }
        }
        System.out.println("Pas d'étudiant avec ce numéro");
        return null;
    }

    public ArrayList<String> findEtudiantByAge(int age){
        ArrayList<String> result =  new ArrayList<>();
        for(Etudiant e : etudiants){
            if(e.getAge() == age){
                System.out.println(e.getPrenom());
                result.add(e.getPrenom());
            }
        }
        return result;
    }


}
