package tp2NotionsDeBase;

import java.util.Scanner;

public class Factorielle {

    // TP2.
    // Écrivez un programme Java qui demande à l’utilisateur d’entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:
    // Ex:
    // Nombre : 3
    // tp2NotionsDeBase.Factorielle de 3 : 3x2x1 = 6
    // Regle de calcul de factorielle : http://villemin.gerard.free.fr/Denombre/Factorie.htm
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez entrer un nombre : ");
        int nombre=keyboardInput.nextInt();
        int result=1;

        for (int i = 1; i <= nombre; i++){
            result = result * i;
        }
        System.out.printf("tp2NotionsDeBase.Factorielle de %d est égale à %d", nombre, result);
    }
}
