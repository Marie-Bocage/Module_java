package tpDeValidation;

import java.util.ArrayList;
import java.util.Arrays;

public class Tp7 {
    public static String alternance(String[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                tab[i] = tab[i].toLowerCase();
            } else {
                tab[i] = tab[i].toUpperCase();
            }
        }
        return Arrays.toString(tab);
    }
    public static void main(String[] args) {
        String[] tab={"a","b","c","d","e"};


        System.out.println(alternance(tab));
    }
}
