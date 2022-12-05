package tp1NotionsDeBase;

import java.util.Scanner;

public class Tp7Calendrier {
    public static void main(String[] args) {

        // Écrire un programme qui permet à l’utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
        // Ex:
        // Mois : 4
        // Résult : Avril
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez entrer un nombre entre 1 et 12 : ");
        int nombreMois=keyboardInput.nextInt();

        String[] listeMois={"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre",
                "Novembre", "Décembre"};

        try {
            String mois=listeMois[nombreMois-1];
            System.out.printf("Mois : %d\nRésultat : %s", nombreMois, mois);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Il n'y a que 12 mois dans une année...");
        }
    }
}
