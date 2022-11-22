package tpDeValidation;

import java.util.Arrays;

public class Tp11 {
    public static String rotation(int[] tab, int nbRotation) {
        int[] tabSortie = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (i < tab.length / 2) {
                tabSortie[i + nbRotation] = tab[i];
            } else if ((i + nbRotation - tab.length) < 0) {
                tabSortie[-(i + nbRotation - tab.length)] = tab[i];
            } else {
                tabSortie[i + nbRotation - tab.length] = tab[i];
            }
            System.out.println(Arrays.toString(tabSortie) + " " + (i + nbRotation - tab.length));
        }
        return Arrays.toString(tabSortie);
    }

    public static void main(String[] args) {
        int[] tab={1, 2, 3, 4, 5};
        int nbRotation=2;

        System.out.println(rotation(tab,nbRotation));
    }
}
