package exo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog {

    public static class NegativeException extends Exception {
        public NegativeException(String message) {
            super(message); // on transmet le message à la classe mère Exception
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a < 0 || b < 0){
                throw new NegativeException("Negative");
            }
            int result = a /b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.print("Division par zérp");
        }catch (InputMismatchException ex){
            System.out.print("Saisie non numérique");
        }catch(NegativeException e){
            System.out.print("Saisie non positive");
        }
    }


}
