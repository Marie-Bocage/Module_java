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

        String[] listeLettre=phraseFormatted.split("");
        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(listeLettre));
        ArrayList<String> autreListe=new ArrayList<>();

        for (String lettre:listeLettre) {
            if (!autreListe.contains(lettre)) {
                autreListe.add(lettre);
            }
        }

        System.out.println(String.join("", autreListe));
    }
}
