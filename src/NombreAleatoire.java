import java.util.Random;
import java.util.Scanner;

public class NombreAleatoire {
    public static void main(String[] args) {
        // génération d'un nombre >= 0 et < 101
        Random r = new Random();
        int n = r.nextInt(101);
        System.out.println(n);

        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Devinez le nombre : ");
        int nombreADeviner=keyboardInput.nextInt();

        do {
            if (nombreADeviner > n){
                System.out.print("Entrez un plus petit nombre : ");
                nombreADeviner=keyboardInput.nextInt();
                continue;
            } else if (nombreADeviner < n) {
                System.out.print("Entrez un plus grand nombre : ");
                nombreADeviner=keyboardInput.nextInt();
                continue;
            } else {
                System.out.println("Vous avez devinez le nombre! Félicitations!");
                break;
            }
        } while (true);
    }
}
