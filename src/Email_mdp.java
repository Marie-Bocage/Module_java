import java.util.Scanner;

public class Email_mdp {
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
            if(nombreTentatives >= 1){
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
