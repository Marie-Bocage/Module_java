import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez entre la première valeur (a) : ");
        double a=keyboardInput.nextDouble();

        System.out.print("Veuillez entre la deuxième valeur (b) : ");
        double b=keyboardInput.nextDouble();

        System.out.print("Veuillez entre la troisième valeur (c) : ");
        double c=keyboardInput.nextDouble();

        System.out.printf("Les valeurs entrées sont :\na = %.1f\nb = %.1f\nc = %.1f\n", a, b, c);
        System.out.printf("Les valeurs permutées sont :\na = %.1f\nb = %.1f\nc = %.1f", c, a, b);
    }
}
