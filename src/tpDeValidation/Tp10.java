package tpDeValidation;

import java.util.ArrayList;

public class Tp10 {
    public static ArrayList<String> maMethode(int[] tab, int somme) {
        ArrayList<String> tabSortie=new ArrayList<>();
        for (int i =0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if ((tab[i] + tab[j]) == somme) {
                    tabSortie.add("[" + tab[i] + "," + tab[j] + "]");
                }
            }
        }
        return tabSortie;
    }

    public static void main(String[] args) {
        int[] tabEntier={2,7,11,15};
        int somme=9;
        System.out.println(maMethode(tabEntier,somme));

        int[] tabEntier2={3,2,4,7,5,-1};
        int somme2=6;
        System.out.println(maMethode(tabEntier2, somme2));
    }
}
