public class Exo_MatriceCarree {
    public static void main(String[] args) {
//        Ecrire un programme Java qui déclare une matrice carrée(3x3)
//        Et qui ensuite va calculer la somme et la différence des deux diagonales
        int[][] matrice={
                {1,4,9},
                {2,6,8},
                {3,5,7}
        };

        int somme=0;
        int somme2=0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (i == j) {
                    somme = somme + matrice[i][j];
                }

                if ((i + j) == (matrice.length - 1)) {
                    somme2 = somme2 + matrice[i][j];
                }
            }
        }
        System.out.printf("Somme diagonale : %d\n", somme+somme2);
        System.out.printf("Différence diagonale : %d\n", somme-somme2);

//        Correction Christian

//        int d1=0;
//        int d2=0;
//        for(int i=0;i<matrice.length;i++){
//            d1 +=matrice[i][i];
//            d2 +=matrice[i][matrice.length-i-1];
//        }
//        int sommeDiagonales=d1+d2;
//        int differenceDiagonales=d1-d2;
//        System.out.printf("Somme : %d\nDifférence : %d\n",sommeDiagonales,differenceDiagonales);
    }
}
