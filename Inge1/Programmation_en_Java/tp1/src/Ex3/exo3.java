package Ex3;

public class exo3 {
    public boolean isBissextile(int annee){
        return (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0 ;
    }

    public boolean estPremier(int nb){
        if(nb <= 1 || nb % 2 == 0){
            return false;
        }
        if(nb == 2 ){
            return true;
        }
        for(int i = 3; i <= Math.sqrt(nb);i++){
            if(nb % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public void nbPremierAnneeNaissance(int annee){
        for(int i = 2 ; i <= annee; i++){
            if(this.estPremier(i)){
                System.out.println(i);
            }
        }
    }

    public boolean isPalindrome(String palin){
        if(palin.length() == 1 || palin.isEmpty()){
            return true;
        }
        if(palin.length() % 2 == 0){
            int j =palin.length() -1 ;
            for(int i = 0; i < palin.length() / 2; i++){
                if(palin.charAt(i) != palin.charAt(j)){
                    return false;
                }
                j--;
            }
        }else{
            int j =palin.length() -1 ;
            for(int i = 0; i < Math.floor((double) palin.length() / 2); i++){
                if(palin.charAt(i) != palin.charAt(j)){
                    return false;
                }
                j--;
            }
        }
        return true;
    }
    public static void main (String[] args){
        exo3 test = new exo3();
        System.out.println(test.isPalindrome("2002"));
        System.out.println(test.isPalindrome("anna"));
        System.out.println(test.isPalindrome("2022"));
    }
}
