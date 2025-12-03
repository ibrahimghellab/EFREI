package exo2;

public class Main {
    public static void main(String[] args){
        Forme carre = new Carre(2,"rouge");
        Forme cercle = new Cercle(3,"noir");
        Forme triangle = new Triangle(3,2,"vert");

        System.out.println("Carré : " + carre.calculerSurface());
        System.out.println("Cercle : " + cercle.calculerSurface());
        System.out.println("Triangle : " + triangle.calculerSurface());

        System.out.println(carre);
        System.out.println(cercle);
        //affiche l'objet dans la mémoire et si on redefinit le toString ca prend sa valeur


        Cercle cercle1 = new Cercle(5,"Rouge");
        Cercle cercle2 = new Cercle(5,"Rouge");
        Cercle cercle3 = new Cercle(7,"Bleu");
        // Comparaison des cercles avant redéfinition de equals()
        System.out.println("Comparaison cercle1 et cercle2 (avant redéfinition equals) : " +
                cercle1.equals(cercle2));
        System.out.println("Comparaison cercle1 et cercle3 (avant redéfinition equals) : " +
                cercle1.equals(cercle3));

    }
}
