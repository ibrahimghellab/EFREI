package exo2;

public class Triangle extends Forme{
    public Triangle(double base, double hauteur,String couleur) {
        super(couleur);
        this.base = base;
        this.hauteur = hauteur;
    }

    double base;
    double hauteur;

    @Override
    public double calculerSurface() {
        return (base*hauteur)/2;
    }
}
