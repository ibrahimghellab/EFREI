package exo1;

public class PaiementCarteCredit implements Paiement{
    @Override
    public String effectuerPaiement(double montant) {
        return "Paiement de " + montant + "€ effectué par Carte de Crédit." ;
    }
}
