import java.util.Scanner;

public class TP5 {
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
