package exoNotionsDeBase;

import java.util.Scanner;

public class Exo_BoucleWhileChristian {

    // 1. Limiter le nombre de tentatives à 5. Au bout de 5 tentatives, afficher.
    // "Vous avez saisi 5 fois des mauvais codes. Votre appareil est bloqué"
    // 2. Au bout de 2 tentatives, commencer à afficher à l'utilisateur le nombre
    // tentatives restantes. Exemple : Il vous reste x nombre des tentatives.
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez définir un code PIN : ");
        int codePin=keyboardInput.nextInt();

        System.out.print("Après quelques minutes, l'appareil s'est verrouillé...\n");
        int codePinATester=0;

        int nombreTentatives=0;

        do {
            if(nombreTentatives >= 2){
                System.out.printf("Il vous reste %d tentatives.", (5 - nombreTentatives));
            }

            System.out.print("Veuillez entrer le code de déverrouillage : ");
            codePinATester=keyboardInput.nextInt();
            nombreTentatives++;

            if(codePinATester != codePin){
                if (nombreTentatives == 5) {
                    System.out.printf("Vous avez saisi %d fois des mauvais codes. Votre " +
                            "appareil est bloqué\n", nombreTentatives);
                    break;
                }
                System.out.println("Code PIN incorrect. Veuillez recommencer.");
                continue;
            } else {
                System.out.println("Félicitations, appareil déverrouillé....");
                break;
            }
        } while (true);
    }
}
