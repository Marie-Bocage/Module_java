package tp1NotionsDeBase;

import java.util.Scanner;

public class Tp5TypeNombre {

    // Ecrivez un programme Java qui lit un nombre et indique s’il est positif, négatif ou s’il vaut zéro et s’il est pair ou impair.
    // Exemple d’exécution:
    // Entrez un nombre entier: 5
    // Le nombre est positif et impair
    // Entrez un nombre entier: -4
    // Le nombre est négatif et pair
    // Entrez un nombre entier: 0
    // Le nombre est zéro (et il est pair)
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Entrer un nombre entier : ");
        int nombreEntier=keyboardInput.nextInt();

        if(nombreEntier<0){
            if(nombreEntier % 2 == 0){
                System.out.println("Le nombre est négatif et pair");
            }else {
                System.out.println("Le nombre est négatif et impair");
            }
        }else if(nombreEntier>0){
            if(nombreEntier % 2 == 0){
                System.out.println("Le nombre est positif et pair");
            }else {
                System.out.println("Le nombre est positif et impair");
            }
        }else {
            System.out.println("Le nombre est zéro (et il est pair)");
        }
    }
}
