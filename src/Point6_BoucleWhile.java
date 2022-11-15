import java.util.Scanner;

public class Point6_BoucleWhile {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez définir un code PIN : ");
        int codePin=keyboardInput.nextInt();

        System.out.print("Après quelques minutes, l'appareil s'est verrouillé...\n");
        int codePinATester=0;

//        while (codePinATester != codePin) {
//            System.out.print("Veuillez entrer le code de déverrouillage : ");
//            codePinATester = keyboardInput.nextInt();
//
//            if (codePinATester == codePin) {
//                System.out.println("Félicitations, appareil déverouillé !");
//            } else {
//                System.out.println("Code PIN incorrect. Veuillez recommencer.");
//            }

        // Boucle do while

        do {
            System.out.print("Veuillez entrer le code de déverrouillage : ");
            codePinATester = keyboardInput.nextInt();

            if (codePinATester == codePin) {
                System.out.println("Félicitations, appareil déverouillé !");
            } else {
                System.out.println("Code PIN incorrect. Veuillez recommencer.");
            }
        } while (codePinATester != codePin);
    }
}
