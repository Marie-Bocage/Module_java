package tpDeValidation;

import java.util.Arrays;
import java.util.Scanner;

public class Tp4 {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir une phrase : ");
        String phrase=keyboardInput.nextLine();

        String delimiteur=" ";
        String[] phraseCoupee=phrase.split(delimiteur);

        String newPhrase="";
        for (String mot:phraseCoupee) {
            mot=mot.substring(0,1).toUpperCase() + mot.substring(1);
            newPhrase += mot + " ";
        }
        System.out.println(newPhrase);
    }
}
