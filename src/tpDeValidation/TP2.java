package tpDeValidation;

import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre : ");
        int nb=keyboardInput.nextInt();

        System.out.printf("Votre nombre : %d\n", nb);

        int reverseNb=0;
        while (nb != 0) {
            int reste = nb % 10;
            reverseNb = reverseNb * 10 + reste;
            nb=nb / 10;
        }
        System.out.printf("Résultat : %d", reverseNb);
    }
}
