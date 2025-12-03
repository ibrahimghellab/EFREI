package exo3;

public class Vehicule {
    private int nbRoues;
    private boolean estComplet;

    public Vehicule(int nbRoues) {
        this.nbRoues = nbRoues;
        estComplet = false;
    }

    public void roule(){
        System.out.println("(" + estComplet + ") Les " + nbRoues + " roues tournent");
    }

    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
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
