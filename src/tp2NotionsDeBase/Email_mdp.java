package tp2NotionsDeBase;

import java.util.Scanner;

public class Email_mdp {

    // Écrire un programme Java qui permet à l’utilisateur de définir une adresse email et un mot de passe.
    // Ensuite dans un second temps, il sera demandé à l’utilisateur de fournir l’email et le mot de passe:
    // Si l’email et le mot de passe ne correspondent pas aux valeurs définies,
    // le message “Identifiants incorrect devra s’afficher”, et l’utilisateur devra recommencer la saisie des valeurs.
    // Sinon, le message “Bienvenu dans votre espace client” devra s’afficher.

    // A l’exercice précédent, s’ajoute un nouveau requirement:
    // Le nombre de fois que l’utilisateur peut saisir des mauvais identifiants est limité à 5,
    // ensuite le programme va s’arrêter avec un message disant.
    // “Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué“.
    // Il faut dire à au user le nombre de tentatives restants
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir une adresse mail : ");
        String mail=keyboardInput.nextLine();

        System.out.print("Veuillez saisir un mot de passe : ");
        String motDePasse=keyboardInput.nextLine();

        String mailATester="";
        String motDePasseATester="";

        int nombreTentatives=0;

        do {
            if (nombreTentatives >= 1) {
                System.out.printf("Il vous reste %d tentatives.\n", (5 - nombreTentatives));
            }

            System.out.print("Veuillez saisir votre adresse mail : ");
            mailATester=keyboardInput.nextLine();
            System.out.print("Veuillez saisir un mot de passe : ");
            motDePasseATester=keyboardInput.nextLine();
            nombreTentatives++;

            if (!mailATester.equals(mail) || !motDePasseATester.equals(motDePasse)) {
                if (nombreTentatives == 5) {
                    System.out.printf("Vous avez saisi %d fois des mauvais identifiants. Votre " +
                            "compte est bloqué\n", nombreTentatives);
                    break;
                }
                System.out.println("Identifiants incorrect.");
                continue;
            } else {
                System.out.println("Bienvenue dans votre espace client");
                break;
            }
        } while (true);
    }
}
