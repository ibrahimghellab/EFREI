package exo3et4et5;

public final class Utilisation {

    private Utilisation() {} // non instanciable

    public static void main(String[] args) {

        System.out.println(Vehicule.getNbVehiculeCree());

        Vehicule v1 = new Vehicule(6);
        v1.roule();
        v1.freine();

        System.out.println(Vehicule.getNbVehiculeCree());

        Avion a1 = new Avion(4, 2);
        a1.invComplet();
        a1.roule();
        a1.vole();
        a1.freine();

        System.out.println(Vehicule.getNbVehiculeCree());

        Vehicule v2 = new Avion(8, 4);
        v2.roule();
        //on ne peut pas le faire voler puisque c'est considere comme un vehicule



        Avion a2 = (Avion) v2;
        a2.vole();
        a2.freine();

        System.out.println(Vehicule.getNbVehiculeCree());

    }


}