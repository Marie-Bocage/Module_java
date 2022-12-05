package tp1NotionsDeBase;

import java.util.Scanner;

public class Tp1CalculSurfaceRayon {

    // Écrire un programme Java qui demande à l’utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.
    // Surface = Rayon x Rayon x PI;
    // Rayon = Diamètre / 2
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir la valeur du diamètre : ");
        double diametre=keyboardInput.nextDouble();

        double rayon=diametre / 2;
        double surface=rayon * rayon * Math.PI;

        System.out.printf("Diamètre : %.1f\nRayon : %.1f\nSurface : %.1f", diametre, rayon, surface);
    }
}
