import java.util.Scanner;

public class Point6_BoucleWhile {
    public static void main(String[] args) {

//        while (codePinATester != codePin) {
//            System.out.print("Veuillez entrer le code de déverrouillage : ");
//            codePinATester = keyboardInput.nextInt();
//
//            if (codePinATester == codePin) {
//                System.out.println("Félicitations, appareil déverouillé !");
//            } else {
//                System.out.println("Code PIN incorrect. Veuillez recommencer.");
//            }

        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez définir un code PIN : ");
        int codePin=keyboardInput.nextInt();

        System.out.print("Après quelques minutes, l'appareil s'est verrouillé...\n");
        int codePinATester=0;

        int compteur=0;

        // Boucle do while

        do {
            System.out.print("Veuillez entrer le code de déverrouillage : ");
            codePinATester = keyboardInput.nextInt();
            compteur+=1;

           if (codePinATester == codePin) {
                System.out.println("Félicitations, appareil déverouillé !");
           } else {
                System.out.println("Code PIN incorrect. Veuillez recommencer.");

                if (compteur >= 2 && compteur < 5) {
                    System.out.printf("Il vous reste %d nombre de tentatives.\n", 5 - compteur);
                } else if (compteur == 5) {
                    System.out.println("Vous avez saisi 5 fois des mauvais codes. Votre appareil est bloqué.");
                }
           }
        } while (codePinATester != codePin && compteur < 5);
    }
}
