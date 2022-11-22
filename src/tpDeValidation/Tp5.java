package tpDeValidation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tp5 {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir une phrase : ");
        String phrase=keyboardInput.nextLine();
        String phraseFormatted=phrase.replaceAll("[^A-Z-a-z]","").toLowerCase();

//        String[] listeLettre=phraseFormatted.split("");
//        ArrayList<String> strList = new ArrayList<String>(
//                Arrays.asList(listeLettre));
        ArrayList<Character> phraseCoupee=new ArrayList<>();
        for (int i = 0; i < phrase.length(); i++) {
            phraseCoupee.add(phrase.charAt(i));
        }

        ArrayList<Character> autreListe=new ArrayList<>();

        for (char lettre:phraseCoupee) {
            if (!autreListe.contains(lettre)) {
                autreListe.add(lettre);
            }
        }

        String finalPhrase="";
        for (char lettre:autreListe) {
            finalPhrase += lettre;
        }

        System.out.printf("Phrase de départ : %s\nPhrase après suppression des doublons : %s", phrase, finalPhrase);
    }
}
