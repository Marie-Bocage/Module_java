package exoNotionsDeBase;

import java.util.Scanner;

public class ExArrayNotes {
    public static void main(String[] args) {

        // 1. Permettre à l'utilisateur de définir le nombres des notes à stocker
        // - La valeur doit toujours être > 0
        // 2. Permettre à l'utilisateur d'entrer les notes du tableau à partir du clavier
        // - Les valeurs ne doivent être qu'entre 0 et 20
        // 3. Calculer et afficher la moyenne

        var keyboardInput=new Scanner(System.in);

        System.out.print("Combien de notes souhaitez-vous entrer ? ");
        var nombreNotes=0;

        do {
            nombreNotes=keyboardInput.nextInt();

            if (nombreNotes <= 0) {
                System.out.print("Le nombre de notes doit être supérieur à 0. Veuillez recommencer : ");
                continue;
            } else {
                double[] notesCours=new double[nombreNotes];
                double moyenne=0;

                for (int i = 0; i <= nombreNotes - 1; i++) {
                    System.out.printf("Veuillez saisir la note n°%d (entre 0 et 20) : ", i+1);
                    notesCours[i]=keyboardInput.nextDouble();

                    if (notesCours[i] < 0 || notesCours[i] > 20) {
                        System.out.println("Notes non valide, veuillez recommencer.");
                        System.out.printf("Veuillez saisir la note n°%d (entre 0 et 20)  : ", i+1);
                        notesCours[i]=keyboardInput.nextDouble();
                    }
                    moyenne = moyenne + notesCours[i];
                }
                System.out.printf("Votre moyenne est de : %.2f", moyenne / nombreNotes);
                break;
            }
        } while (true);
    }
}
