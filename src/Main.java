import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int age=44;
        String nom="Bocage";
        String prenom="Marie";
        double poids=70.57;

        // Affichage

        /*
        System.out.println(age);
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(poids);
        */
//        System.out.println("Je m'appelle Christian Lisangola, j'ai 44 ans et je pese 90" + "kg");

        System.out.println("Je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans et je pèse "
                + poids + " kg");

        // Retirer "ln" du "print" permet de tout metre sur la même ligne
        /*System.out.print("Je suis");
        System.out.print("Tu es");
        System.out.print("Il/Elle est");*/

        System.out.printf("Je m'appelle %s %s, j'ai %d ans et je pèse %.1f kg", prenom, nom, age, poids);

        // printf pas de retour à la ligne automatique, il faut ajouter \n à la fin
        System.out.printf("Nom : %s\nPrenom : %s\ntp1NotionsDeBases.Age : %d\nPoids : %f", nom, prenom, age, poids);

        // Exo_1 : calcul de la surface et du périmètre

        // Point2 : Saisie clavier

        // Exo_2 : Demander et afficher le nom, prénom, age et poids de l'utilisateur


    }
}