package notionsDeBase;

import java.util.ArrayList;

public class Point18_TableauDynamiques {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        System.out.printf("Taille du tableau : %d\n", fruits.size());
        // Add ajoute des éléments dans le tableau
        fruits.add("Pommes");
        fruits.add("Banane");
        fruits.add("Orange");
        System.out.printf("Taille du tableau après ajout : %d\n", fruits.size());
        System.out.println(fruits);

        // Remove retire des éléments dans le tableau
        fruits.remove(0);
        System.out.printf("Taille du tableau après suppression : %d\n", fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.get(0));

        //        Tableau des tableaux
//        Peut être utilisé pour créer des matrices
        ArrayList<ArrayList<Integer>> matrice=new ArrayList<>();
    }
}
