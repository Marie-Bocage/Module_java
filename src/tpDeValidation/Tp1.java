package tpDeValidation;

import java.util.Arrays;

public class Tp1 {
    public static void main(String[] args) {
        int[] tab={12,3,5,6,-3};

        int pg=0;
        int pp=0;
        System.out.println(Arrays.toString(tab));
        for (int i = 0; i < tab.length; i++) {
            if (pp > tab[i]) {
                pp=tab[i];
;            }
            if (pg < tab[i]) {
                pg=tab[i];
;            }
        }

        System.out.println("\nRésultat :\n");
        String tb="Tb : [";
        for (int nb:tab) {
            if (nb == pg) {
                tb += nb + "(PG),";
            } else if (nb == pp) {
                tb += nb + "(PP),";
            } else {
                tb += nb +",";
            }
        }
        System.out.printf("%s]\nPlus grand : %d\nPlus petit : %d", tb.substring(0, tb.length() - 1), pg, pp);
    }
}
