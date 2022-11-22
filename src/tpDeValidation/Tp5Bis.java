package tpDeValidation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tp5Bis {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir une phrase : ");
        String phrase=keyboardInput.nextLine();
//        String phraseFormatted=phrase.replaceAll("[^A-Z-a-z]","").toLowerCase();

        String[] listeMot=phrase.split(" ");
        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(listeMot));
        System.out.println(strList);
        ArrayList<String> autreListe=new ArrayList<>();

        for (String mot:listeMot) {
            if (!autreListe.contains(mot)) {
                autreListe.add(mot);
            }
        }

        System.out.println(String.join(" ", autreListe));
    }
}
