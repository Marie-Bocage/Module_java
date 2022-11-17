import java.util.Arrays;
import java.util.Scanner;

public class TP3_TableauFois3 {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        // Initialise array à 2D
        int[][] tab=new int[3][];

        // Initialise la taille des différentes colonnes
        tab[0]=new int[6];
        tab[1]=new int[5];
        tab[2]=new int[3];

        // Boucle pour demander à l'utilisateur de remplir le tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.printf("Veuillez remplir le tableau %d de taille %d : ", i + 1, tab[i].length);
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j]=keyboardInput.nextInt();
            }
        }

        // Affiche les tableau au format Tn : [...]
        for (int i = 0; i < tab.length; i++) {
            System.out.println("T" + (i + 1) + " : " + Arrays.toString(tab[i]));
        }

        // Somme de tous les elements multiples de trois
        int somme=0;
        String charactereSomme="S = ";

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] % 3 == 0) {
                    somme += tab[i][j];
                    charactereSomme += (Integer.toString(tab[i][j]) + "+");
                }
            }
        }

        // Affichage de la somme
        System.out.println(charactereSomme.substring(0, charactereSomme.length() - 1) + " = " + somme);
    }
}
//
//    Écrire un programme Java qui permet à l’utilisateur de déclarer 3 tableaux d’entiers.
//        Ces tableaux ne doivent pas forcément avoir la même taille
//        Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,élémentS] et la somme de tous les éléments multiples 3 dans les 3 tableaux.
//        Ex :
//        T1 : [ 2, 6, 8, 15,39,11 ]
//        T2 : [ 21, 33, 12, 19,0 ]
//        T3 : [ 17, 18, 46 ]
//        S = 6+15+39+21+33+12+18 = 144