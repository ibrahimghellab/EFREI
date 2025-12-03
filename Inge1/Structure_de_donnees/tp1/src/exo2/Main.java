package tp2;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Historique h = new Historique("efrei.net");
        h.ajouterElement("cnn.com");
        h.ajouterElement("yahoo.com");

        Scanner sc = new Scanner(System.in);

        String next = "";
        while(!next.equals("exit")) {
            next = sc.nextLine();
           if (next.toLowerCase().equals("right")) {
                h.avancer();
            } else {
                h.reculer();
            }
        }


        System.out.println(h);


















    }
}
