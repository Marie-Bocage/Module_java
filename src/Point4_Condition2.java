import java.util.Scanner;

public class Point4_Condition2 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez définir un code PIN : ");
        int codePin=keyboardInput.nextInt();

        System.out.println("Après quelques minutes, l'appareil s'est verrouillé... ");
        System.out.print("Veuillez entrer le code de déverrouillage : ");
        int codePinATester=keyboardInput.nextInt();

        if(codePinATester == codePin){
            System.out.println("Félicitations, appareil déverrouillé...");
        }else{
            System.out.println("Code PIN incorrect");
        }
    }
}
