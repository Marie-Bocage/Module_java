import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir la valeur du diamètre : ");
        double diametre=keyboardInput.nextDouble();

        double rayon=diametre / 2;
        double surface=rayon * rayon * Math.PI;

        System.out.printf("Diamètre : %.1f\nRayon : %.1f\nSurface : %.1f", diametre, rayon, surface);
    }
}
