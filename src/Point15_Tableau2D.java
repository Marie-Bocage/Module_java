import java.util.Arrays;

public class Point15_Tableau2D {
    public static void main(String[] args) {
        int tab[][]={
                {3,4,5},
                {12,19,32},
                {1,7,9}
        };

        System.out.printf("Accéder à 19 => tab[1][1] : %d\n", tab[1][1]);

        for (int i = 0; i < tab.length; i++) {
//            System.out.println(Arrays.toString(tab[i]));
            for (int j = 0; j < tab.length; j++) {
                System.out.println(tab[i][j]);
            }
        }
//        Nombre de lignes != du nombre de colonnes

        int[][] tab2={
                {1,2,6,5,},
                {2,4,9,},
                {7,3}
        };

        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2[i].length; j++) {
                System.out.println(tab2[i][j]);
            }
        }
    }
}
