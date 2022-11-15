import java.util.Scanner;

public class Exo_2 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Entrer votre nom : ");
        String nom= keyboardInput.nextLine();

        System.out.print("Entrer votre prénom : ");
        String prenom= keyboardInput.nextLine();

        System.out.print("Entrer votre âge : ");
        int age= keyboardInput.nextInt();

        System.out.print("Entrer votre poids : "); // Saisir avec une ","
        double poids= keyboardInput.nextDouble();

        System.out.printf("Nom : %s\nPrénom : %s\nAge : %d ans\nPoids : %.1f kg", nom, prenom, age, poids);

    }
}
