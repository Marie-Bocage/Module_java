import java.util.Random;
import java.util.Scanner;

public class NombreAleatoire {
    public static void main(String[] args) {
        // génération d'un nombre 1 et 100
        Random r=new Random();
        int bornInf=1;
        int bornSup=100;
        int nombreAleatoire = r.nextInt(bornSup - bornInf + 1) + bornInf;
        System.out.println(nombreAleatoire);

        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Devinez le nombre : ");
        int nombreADeviner=keyboardInput.nextInt();

        do {
            if (nombreADeviner > nombreAleatoire){
                System.out.print("Entrez un plus petit nombre : ");
                nombreADeviner=keyboardInput.nextInt();
                continue;
            } else if (nombreADeviner < nombreAleatoire) {
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
