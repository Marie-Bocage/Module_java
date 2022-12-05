package notionsDeBase;

public class Point5_BoucleFor {
    public static void main(String[] args) {
        // Dry : don't repeat yourself
//        System.out.printf("Le carré de 2 est %f\n", Math.pow(2,2));
//        System.out.printf("Le carré de 3 est %f\n", Math.pow(3,2));
//        System.out.printf("Le carré de 4 est %f\n", Math.pow(4,2));
//        System.out.printf("Le carré de 5 est %f\n", Math.pow(5,2));

//        Les nombres évoluent de 2 à 10 avec un pas de 1
//        On sait quand s'arrêter

        for(int nombre = 2; nombre <= 10; nombre++){
            System.out.printf("Le carré de %d est %.1f\n", nombre, Math.pow(nombre,2));
        }
    }
}
