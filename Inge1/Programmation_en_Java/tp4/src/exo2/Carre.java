package exo2;

public class Carre extends Forme{

    double cote;

    @Override
    public String toString() {
        return "Le carré est de couleur " + couleur + ", sa surface est " + calculerSurface() + " cm^2";
    }

    public Carre(double cote, String couleur) {
        super(couleur);
        this.cote = cote;
    }

    @Override
    public double calculerSurface() {
        return cote*cote;
    }
}
