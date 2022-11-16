import java.util.Random;
import java.util.Scanner;

public class NombreAleatoire {
    public static void main(String[] args) {
        // génération d'un nombre 1 et 100
        Random r=new Random();
        int bornInf=1;
        int bornSup=100;
//        int nombreAleatoire=r.nextInt(3); // Nombre entre 0 et 3 exclu !
        int nombreAleatoire=r.nextInt(bornSup - bornInf + 1) + bornInf;
//        System.out.println(nombreAleatoire);

        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Devinez le nombre : ");

        do {
            int nombreADeviner=keyboardInput.nextInt();

            if (nombreADeviner > nombreAleatoire){
                System.out.print("Entrez un plus petit nombre : ");
                continue;
            } else if (nombreADeviner < nombreAleatoire) {
                System.out.print("Entrez un plus grand nombre : ");
                continue;
            } else {
                System.out.println("Vous avez devinez le nombre! Félicitations!");
                break;
            }
        } while (true);
    }
}
