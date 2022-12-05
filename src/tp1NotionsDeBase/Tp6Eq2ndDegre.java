package tp1NotionsDeBase;

import java.util.Scanner;

public class Tp6Eq2ndDegre {

    // Écrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
    // L’utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
    // Principe du fonctionnement d’une équation du 2nd degré:
    // https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir a : ");
        double a=keyboardInput.nextDouble();
        System.out.print("Veuillez saisir b : ");
        double b=keyboardInput.nextDouble();
        System.out.print("Veuillez saisir c : ");
        double c=keyboardInput.nextDouble();

        double discriminant=Math.pow(b,2) - 4 * a * c;

        if(discriminant<0){
            System.out.println("L'équation n'a pas de solution réelle.");
        }else if(discriminant == 0){
            double solution=-b / 2 * a;
            System.out.printf("L'équation a une unique solution : %.1f\n", solution);
        }else {
            double solution1=-b - Math.sqrt(discriminant) / 2 * a;
            double solution2=-b + Math.sqrt(discriminant) / 2 * a;
            System.out.printf("L'équation a deux solution :\nx1 = %.1f\nx2 = %.1f\n", solution1, solution2);
        }

    }
}
