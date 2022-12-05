package notionsDeBase;

import java.util.Scanner; // Permet de donner la possibilité à l'utilisateur de saisir des valeurs à partir du clavier clavuer

public class Point2_LectureClavier {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Entrer la longueur : "); // println fait entrer la valeur une ligne en dessous de la question
        double longueur= keyboardInput.nextDouble();

        System.out.print("Entrer la largueur : ");
        double largeur= keyboardInput.nextDouble();

        double surface=longueur * largeur;
        double perimetre=2 * (longueur + largeur);

        System.out.printf("Longueur : %.1f m\nLargeur : %.1f m\nSurface : %.1f m²\nPerimètre : %.1f m", longueur,
                largeur, surface, perimetre);
    }
}
