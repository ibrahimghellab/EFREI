package ex1;

public class TestTableau {

    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main (String[] args){
        int[] nbPages = {120,350,200,500,175,90,300};
        int somme = 0 ;
        int min = nbPages [0];
        System.out.println("Affichage des nombres de pages : ");
        for( int i= 0; i < nbPages.length; i++ ){
            somme += nbPages[i];
            System.out.println("Livre " + i + " : " + nbPages[i] + " pages");
            if(min > nbPages[i]){
                min = nbPages[i];
            }
        }
        System.out.println("Somme totale des pages : " + somme);
        System.out.println("Nombre minimum : " + min);
        float moyenne = (float) somme / (float) nbPages.length;
        System.out.println("Moyenne de pages : " + moyenne);

        sort(nbPages);
        for(int i : nbPages){
            System.out.print(i + " , ");
        }

    }

}
