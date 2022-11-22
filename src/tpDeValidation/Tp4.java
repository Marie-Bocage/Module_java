package tpDeValidation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tp4 {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir une phrase : ");
        String phrase=keyboardInput.nextLine() + " ";

//        String delimiteur=" ";
//        String[] phraseCoupee=phrase.split(delimiteur);
        ArrayList<String> phraseCoupee=new ArrayList<>();
        String test="";
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') {
                phraseCoupee.add(test);
                test="";
            } else {
                test += phrase.charAt(i);
            }
        }


        String newPhrase="";
        for (String mot:phraseCoupee) {
            mot=mot.substring(0,1).toUpperCase() + mot.substring(1);
            newPhrase += mot + " ";
        }
        System.out.println(newPhrase);
    }
}
