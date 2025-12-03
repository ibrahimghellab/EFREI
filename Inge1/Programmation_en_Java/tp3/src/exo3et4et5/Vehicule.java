package exo3et4et5;

public class Vehicule {

    public static final int MIN_ROUES = 3;

    private int nbRoues;
    private boolean estComplet;

    static int nbVehiculeCree = 0;
    // si on le met pas en statique et que l'on cree trois instance de vehicule il y aura trois compteur soit un pour chaque vehicule independant des deux autres on met donc cette attribut en statitque pour qu'il soit partage entre toutes les instances
    // this.aNombre n'aura pas de sens puisuqe la propriete appartient a la classe et pas au instance on n'y accede en faisant Vehicule.aNombre

    public static int getNbVehiculeCree() {
        return nbVehiculeCree;
    }

    public static void setNbVehiculeCree(int nbVehiculeCree) {
        Vehicule.nbVehiculeCree = nbVehiculeCree;
    }

    public Vehicule(int nbRoues) {
        setNbRoues(nbRoues);
        estComplet = false;
        nbVehiculeCree++;
    }

    public void roule(){
        System.out.println("(" + estComplet + ") Les " + nbRoues + " roues tournent");
    }

    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
       if(nbRoues < MIN_ROUES){
           this.nbRoues = MIN_ROUES;
       }else{
           this.nbRoues = nbRoues;
       }
    }

    public boolean isEstComplet() {
        return estComplet;
    }

    public void setEstComplet(boolean estComplet) {
        this.estComplet = estComplet;
    }

    public void freine(){
        System.out.println("J'appuie sur le frein.");
    }

    public void invComplet(){
        estComplet = !estComplet;
    }

}
