package exo2;

public abstract class Forme {
    String couleur;

    public Forme(String couleur) {
        this.couleur = couleur;
    }

    public abstract double calculerSurface();


}
