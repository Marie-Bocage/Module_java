package tpDeValidation;

import java.util.HashMap;
import java.util.Scanner;

public class Tp3 {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir le premier mot : ");
        String mot1NonForma=keyboardInput.nextLine();
        String mot1=mot1NonForma.replaceAll("[^A-Z-a-z]","").toLowerCase();

        System.out.print("Veuillez saisir le deuxième mot : ");
        String mot2NonForma=keyboardInput.nextLine();
        String mot2=mot2NonForma.replaceAll("[^A-Z-a-z]","").toLowerCase();

        if (mot1.length() != mot2.length()) {
            System.out.println("Les mots " + mot1 + " et " + mot2 + " ne sont pas des anagrammes");
        } else {
            HashMap<Character, Integer> mot1Map = new HashMap<>();
            HashMap<Character, Integer> mot2Map = new HashMap<>();

            for (int i = 0; i < mot1.length(); i++) {
                if (mot1Map.containsKey(mot1.charAt(i))) {
                    int nombreMiseAJour = mot1Map.get(mot1.charAt(i)) + 1;
                    mot1Map.replace(mot1.charAt(i), nombreMiseAJour);
                } else {
                    mot1Map.put(mot1.charAt(i), 1);
                }
            }

            for (int i = 0; i < mot2.length(); i++) {
                if (mot2Map.containsKey(mot2.charAt(i))) {
                    int nombreMiseAJour = mot2Map.get(mot2.charAt(i)) + 1;
                    mot2Map.replace(mot2.charAt(i), nombreMiseAJour);
                } else {
                    mot2Map.put(mot2.charAt(i), 1);
                }
            }

            if (mot1Map.equals(mot2Map)) {
                System.out.println("Les mots " + mot1 + " et " + mot2 + " sont des anagrammes");
            } else {
                System.out.println("Les mots " + mot1 + " et " + mot2 + " ne sont pas des anagrammes");
            }
        }
    }
}
