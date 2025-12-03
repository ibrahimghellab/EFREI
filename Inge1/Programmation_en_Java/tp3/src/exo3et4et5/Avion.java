package exo3et4et5;

public class Avion extends Vehicule{

    public int nbReact;

    public Avion(int nbRoues, int nbReact) {
        super(nbRoues);
        this.nbReact = nbReact;
    }


    public void vole(){
        System.out.println("Je vole.");
    }

    @Override
    public void freine(){
        System.out.println("J'inverse les " + this.nbReact + " réacteurs");
        super.freine();
    }

    @Override
    public void roule(){
        if(super.isEstComplet()){
            System.out.println("Je pousse les réacteurs.");
        }
        super.roule();
    }




}
