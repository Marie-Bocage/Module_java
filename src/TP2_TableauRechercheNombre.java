import java.util.Arrays;
import java.util.Scanner;

public class TP2_TableauRechercheNombre {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez choisir la taille du tableau : ");
        int tabSize=keyboardInput.nextInt();

        int[] tabARemplir=new int[tabSize];
        System.out.print("Veuillez remplir le tableau : ");
        for (int i = 0; i < tabARemplir.length; i++) {
            tabARemplir[i]=keyboardInput.nextInt();
        }

        for (int i = 0; i < tabARemplir.length; i++) {
            System.out.println(tabARemplir[i]);
        }

        System.out.print("Veuillez entrer un nombre à chercher dans le tableau : ");
        int nombreAChercher=keyboardInput.nextInt();

        int occurrence = 0;

        for (int i = 0; i < tabARemplir.length; i++) {
            if (tabARemplir[i] == nombreAChercher) {
                occurrence++;
                System.out.println(occurrence);
            }
        }
        if (occurrence == 0) {
            System.out.println("Le nombre recherché n'existe pas");
        } else {
            System.out.printf("%d existe et se retrouve %d fois dans le tableau", nombreAChercher, occurrence);
        }
    }
}
