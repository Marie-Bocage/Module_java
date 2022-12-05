package tp1NotionsDeBase;

import java.util.Scanner;

public class Tp3Permutations {

    // Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
    // Exemple :
    // Entrez la première valeur(a) : 51
    // Entrez la deuxième valeur(b) : 876
    // Entrez la troisième valeur(c) : 235
    // Les valeurs entrées sont : a = 51, b = 876 et c = 235
    // Permutation: b <== a, c <== b, a <== c
    // Les valeurs permutées sont : a = 235, b = 51 et c = 876
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez entre la première valeur (a) : ");
        double a=keyboardInput.nextDouble();

        System.out.print("Veuillez entre la deuxième valeur (b) : ");
        double b=keyboardInput.nextDouble();

        System.out.print("Veuillez entre la troisième valeur (c) : ");
        double c=keyboardInput.nextDouble();

        System.out.printf("Les valeurs entrées sont :\na = %.1f\nb = %.1f\nc = %.1f\n", a, b, c);
        System.out.printf("Les valeurs permutées sont :\na = %.1f\nb = %.1f\nc = %.1f", c, a, b);
    }
}
