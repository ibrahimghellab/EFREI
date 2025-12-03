package exo2;

public class Cercle extends Forme{

    double rayon;

    public Cercle(double rayon,String couleur) {
        super(couleur);
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public boolean equals(Object c) {
        return c.getClass() == this.getClass() && this.couleur.equals(((Cercle)(c)).couleur) && this.rayon == ((Cercle) c).rayon;
    }


    @Override
    public String toString() {
        return "Le cercle est de couleur " + couleur + ", sa surface est " + calculerSurface() + " cm^2";
    }

}
