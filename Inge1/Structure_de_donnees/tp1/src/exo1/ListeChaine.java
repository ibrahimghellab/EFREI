package exo1;

public class ListeChaine {
    Maillon head;

    public void ajouterDebut(int val){
        Maillon m = new Maillon(val);
        if(head == null ){
            head = m;
            return;
        }
        m.suivant = head;
        head = m;
    }

    public void ajouterFin(int val){
        Maillon m = new Maillon(val);
        if(head == null ){
            head = m;
            return;
        }
        Maillon maillonCourant = head;
        while (maillonCourant.suivant != null) {
            maillonCourant = maillonCourant.suivant;
        }
        maillonCourant.suivant = m;
    }

    public Maillon rechercher(int val){
        if(head == null ){
            return null;
        }
        Maillon maillonCourant = head;
        while (maillonCourant != null) {
            if(maillonCourant.x == val){
                return maillonCourant;
            }
            maillonCourant = maillonCourant.suivant;
        }
        return null;
    }

    public void supprimer_debut(){
        if(head == null){
            return;
        }
        head = head.suivant;
    }

    public void supprimer_fin(){
        if(head == null ){
            return;
        }
        if (head.suivant == null){
            head = null;
            return;
        }
        Maillon maillonCourant = head;
        while (maillonCourant.suivant.suivant != null) {
            maillonCourant = maillonCourant.suivant;
        }
        maillonCourant.suivant = null;

    }

    public void supprimer_val(int val){

        if(head == null){
            return;
        }
        if(head.x == val){
            head = head.suivant;
            return;
        }

        Maillon maillonCourant = head;

        while (maillonCourant.suivant.suivant != null && maillonCourant.suivant.x != val){
            maillonCourant = maillonCourant.suivant;
        }

        if(maillonCourant.suivant.x == val){
            if(maillonCourant.suivant.suivant != null){
                maillonCourant.suivant = maillonCourant.suivant.suivant;
            }else{
                maillonCourant.suivant = null;
            }
        }
    }


    public Maillon getHead() {
        return head;
    }

    public void afficherListe() {
        if (head == null) {
            System.out.println("Liste vide");
            return;
        }

        Maillon courant = head;
        while (courant != null) {
            System.out.print(courant.x);
            if (courant.suivant != null) {
                System.out.print(" -> ");
            }
            courant = courant.suivant;
        }
        System.out.println(); // retour à la ligne à la fin
    }


    public void setHead(Maillon prev) {
        this.head = prev;
    }
}
