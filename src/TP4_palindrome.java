import java.util.Scanner;

public class TP4_palindrome {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        // On demande à l'utilisateur de saisir un texte
        System.out.print("Veuillez saisir un texte : ");
        String texteSaisi=keyboardInput.nextLine();
        String formattedPhrase=texteSaisi.replaceAll("[^A-Z-a-z]","").toLowerCase();

        String texteEnvers="";
        for(int i = formattedPhrase.length() - 1; i >= 0; i--)
        {
            texteEnvers = texteEnvers + formattedPhrase.charAt(i);
        }
        if (texteEnvers.equals(formattedPhrase)) {
            System.out.printf("%s est un palindrome", texteSaisi);
        } else {
            System.out.printf("%s n'est pas un palindrome", texteSaisi);
        }
    }
}
