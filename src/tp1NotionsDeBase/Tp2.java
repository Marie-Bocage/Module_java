package tp1NotionsDeBase;

import java.util.Scanner;

public class Tp2 {

    // Ecrire un programme Java qui demande à l’utilisateur de saisir son nom, prenom et age,
    // et qui ensuite va afficher le message : “Vous vous appelez <prenom> <nom>, et vous avez <age> ans”
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir votre nom : ");
        String nom=keyboardInput.nextLine();

        System.out.print("Veuillez saisir votre prénom : ");
        String prenom=keyboardInput.nextLine();

        System.out.print("Veuillez saisir votre âge : ");
        int age=keyboardInput.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans.", prenom, nom, age);
    }
}
