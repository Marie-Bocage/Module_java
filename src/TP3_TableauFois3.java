import java.util.Arrays;
import java.util.Scanner;

public class TP3_TableauFois3 {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        int[] tab1=new int[6];
        int[] tab2=new int[5];
        int[] tab3=new int[3];

        System.out.printf("Veuillez remplir le tableau 1 de taille %d : ", tab1.length);
        for (int i = 0; i < tab1.length; i++) {
            tab1[i]=keyboardInput.nextInt();
        }

        System.out.printf("Veuillez remplir le tableau 2 de taille %d : ", tab2.length);
        for (int i = 0; i < tab2.length; i++) {
            tab2[i]=keyboardInput.nextInt();
        }

        System.out.printf("Veuillez remplir le tableau 3 de taille %d : ", tab3.length);
        for (int i = 0; i < tab3.length; i++) {
            tab3[i]=keyboardInput.nextInt();
        }

        System.out.println("T1 : " + Arrays.toString(tab1));
        System.out.println("T2 : " + Arrays.toString(tab2));
        System.out.println("T3 : " + Arrays.toString(tab3));

        int somme=0;
        String charactereSomme="S = ";
        for (int i = 0; i < tab1.length; i++){
            if (tab1[i] % 3 == 0) {
                somme += tab1[i];
                charactereSomme += (Integer.toString(tab1[i]) + "+");
            }
        }
//        System.out.println(somme);
        for (int i = 0; i < tab2.length; i++){
            if (tab2[i] % 3 == 0) {
                somme += tab2[i];
                charactereSomme += (Integer.toString(tab2[i]) + "+");
            }
        }
//        System.out.println(somme);
        for (int i = 0; i < tab3.length; i++){
            if (tab3[i] % 3 == 0) {
                somme += tab3[i];
                charactereSomme += (Integer.toString(tab3[i]) + "+");
            }
        }
//        System.out.println(somme);
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