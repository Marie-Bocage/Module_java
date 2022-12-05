package exoNotionsDeBase;

import java.util.Scanner;

public class ExoDemanderIdentite {

    // Ecrire un programme qui demande à l’utilisateur de saisir à partir le nom, le prénom, l’age et le poids.
    // Et Afficher ensuite l’identité avec le format:
    // Nom : Lisangola
    // Prénom : Christian
    // tp1NotionsDeBases.Age : 45 ans
    // Poids :  79 kg
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Entrer votre nom : ");
        String nom= keyboardInput.nextLine();

        System.out.print("Entrer votre prénom : ");
        String prenom= keyboardInput.nextLine();

        System.out.print("Entrer votre âge : ");
        int age= keyboardInput.nextInt();

        System.out.print("Entrer votre poids : "); // Saisir avec une ","
        double poids= keyboardInput.nextDouble();

        System.out.printf("Nom : %s\nPrénom : %s\ntp1NotionsDeBases.Age : %d ans\nPoids : %.1f kg", nom, prenom, age, poids);

    }
}
