import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez entrer un nombre : ");
        int nombre=keyboardInput.nextInt();
        int result=1;

        for (int i = 1; i <= nombre; i++){
            result = result * i;
        }
        System.out.printf("Factorielle de %d est égale à %d", nombre, result);
    }
}
