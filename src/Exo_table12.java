import java.util.Scanner;

public class Exo_table12 {
    public static void main(String[] args) {
//        for(int nombre = 2; nombre <= 13; nombre++){
//            System.out.printf("12 x %d = %d\n", nombre, 12 * nombre);
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Entrez le nombre dont vous voulez la table : ");
        int nombreAMultiplier=keyboardInput.nextInt();

        System.out.print("Entrez le nombre de départ : ");
        int depart=keyboardInput.nextInt();

        System.out.print("Entrez le nombre d'arrêt : ");
        int arret=keyboardInput.nextInt();

        for(int i = depart; i <= arret; i++){
            System.out.printf("%d x %d = %d\n", nombreAMultiplier, i, nombreAMultiplier * i);
        }
    }
}
