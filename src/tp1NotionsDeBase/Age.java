package tp1NotionsDeBase;

import java.util.Scanner;

public class Age {

    // Ecrivez un programme tp1NotionsDeBases.Age.java qui demande son âge à l’utilisateur ;
    // lit la réponse de l’utilisateur et l’enregistre dans une variable age de type entier ;
    // Effectue le calcul de l’année de naissance de l’utilisateur et l’enregistre dans la variable annee de type entier ;
    // affiche l’année de naissance ainsi calculée.
    // Exemple d’exécution du programme:
    // Donnez votre age : 29
    // Votre année de naissance est : 1992
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Quel est votre âge ? ");
        int age=keyboardInput.nextInt();
        int anneeDeNaissance=2022 - age;

        System.out.printf("Votre année de naissance est %d", anneeDeNaissance);
    }
}
