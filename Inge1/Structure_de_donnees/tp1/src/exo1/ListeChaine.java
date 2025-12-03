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


    public void afficherListe(){
        if(head == null ){
            System.out.println("Liste vide");
            return;
        }
        Maillon maillonCourant = head;
        while(maillonCourant.suivant !=null){

            System.out.println(maillonCourant.x);
            System.out.println("|");
            System.out.println("^");
            maillonCourant = maillonCourant.suivant;
        }
        System.out.println(maillonCourant.x);
    }


}
