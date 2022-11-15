import java.sql.SQLOutput;
import java.util.Scanner;

public class E3_Booleens {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entrez une valeur : ");
        int nombre=input.nextInt();
//        System.out.println(input.nextInt());
//        System.out.println(input.nextInt());
//        System.out.println(input.nextInt());
       /* String nomComplet=input.nextLine();
        System.out.println(nomComplet);*/

        boolean estPair=nombre%2==0;
//        String parite="";
//
//        if (estPair) {
//            parite="pair";
//        } else {
//            parite="impair";
//        }

        // Operateur ternaire
        String parite=estPair?"pair":"impair";

        if (nombre>0) {
            System.out.printf("%d est positif et %s", nombre, parite);
        } else if (nombre<0) {
            System.out.printf("%d est negatif et %s", nombre, parite);
        } else {
            System.out.println("0 et pair");
        }
    }
}
