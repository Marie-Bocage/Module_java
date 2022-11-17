import java.util.HashMap;
import java.util.Scanner;

public class TP1_HashMap {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        // On demande à l'utilisateur de saisir un texte
        System.out.print("Veuillez saisir un texte : ");
        String texteSaisi=keyboardInput.nextLine();

        // On crée la HashMap vide
        HashMap<Character, Integer> occurrencesTexte=new HashMap<>();

        // Remplissage de la HashMap
        for (int i = 0; i < texteSaisi.length(); i++) {
            if (occurrencesTexte.containsKey(texteSaisi.charAt(i))) {
                int nombreMiseAJour = occurrencesTexte.get(i) + 1;
                occurrencesTexte.replace(texteSaisi.charAt(i), nombreMiseAJour);
            } else {
                System.out.println(occurrencesTexte);
                occurrencesTexte.put(texteSaisi.charAt(i), 1);
            }
        }
        System.out.println(occurrencesTexte);
    }
}
