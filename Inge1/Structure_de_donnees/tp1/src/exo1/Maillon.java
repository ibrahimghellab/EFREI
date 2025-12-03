package exo1;

public class Maillon {
    int x;

    public Maillon getSuivant() {
        return suivant;
    }

    public void setSuivant(Maillon suivant) {
        this.suivant = suivant;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    Maillon suivant;

    Maillon(int x){
        this.x = x;
        suivant = null;
    }
}
