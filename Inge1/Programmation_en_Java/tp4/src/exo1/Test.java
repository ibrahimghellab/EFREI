package exo1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<Paiement> mesPaiements = new ArrayList<>();
        mesPaiements.add(new PaiementPayPal());
        mesPaiements.add(new PaiementCryptomonnaie());
        mesPaiements.add(new PaiementCarteCredit());

        for(Paiement p : mesPaiements){
            System.out.println(p.effectuerPaiement(125));
        }
    }
}
