package tp3NotionsDeBase;

import java.util.Scanner;

public class Tp2TableauRechercheNombre {

    // Écrire un programme Java qui demande à l’utilisateur de remplir un tableau d’entiers à partir du clavier.
    // Puis le programme devra lui demander d’entrer un nombre à rechercher dans le tableau.
    // Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu’ils se retrouve dans le tableau
    // Sinon le programme lui dira que le nombre recherché n’existe pas dans le tableau
    // Ex : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
    // ->Entrer un nombre à rechercher : 6
    // ->6 existe et se retrouve 3 fois dans le tableau

    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez choisir la taille du tableau : ");
        int tabSize=keyboardInput.nextInt();

        int[] tabARemplir=new int[tabSize];
        System.out.print("Veuillez remplir le tableau : ");
        for (int i = 0; i < tabARemplir.length; i++) {
            tabARemplir[i]=keyboardInput.nextInt();
        }

        for (int i = 0; i < tabARemplir.length; i++) {
            System.out.println(tabARemplir[i]);
        }

        System.out.print("Veuillez entrer un nombre à chercher dans le tableau : ");
        int nombreAChercher=keyboardInput.nextInt();

        int occurrence = 0;

        for (int i = 0; i < tabARemplir.length; i++) {
            if (tabARemplir[i] == nombreAChercher) {
                occurrence++;
                System.out.println(occurrence);
            }
        }
        if (occurrence == 0) {
            System.out.println("Le nombre recherché n'existe pas");
        } else {
            System.out.printf("%d existe et se retrouve %d fois dans le tableau", nombreAChercher, occurrence);
        }
    }
}
