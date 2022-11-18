public class TP2_RechercherDansTableau {
    public static String searchTable(int[][] tab, int nombre) {

        int occurrenceNombre=0;
        String index="(";

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] == nombre) {
                    index += i + "," + j + "),(";
                    occurrenceNombre++;
                }
            }
        }
        return nombre + " apparait " + occurrenceNombre + " fois dans le tableau aux indices suivants : " + index.substring(0, index.length() - 2);
    }

    public static void main(String[] args) {
        int[][] tab={{1,2,3},
            {2,1,3,5,2,6,4}};
        System.out.println(searchTable(tab, 2));
//        System.out.println(tab.length);
        int[][] tab2={{1, 4, 2, 1},
        {6, 3, 8, 9},
        {1, 5, 1, 0}};
        System.out.println(searchTable(tab2, 1));

    }
}
