package exo1;

public class PaiementCryptomonnaie implements Paiement{

    @Override
    public String effectuerPaiement(double montant) {
        return "Paiement de " + montant + "€ effectué par Cryptomonnaie." ;
    }
}
