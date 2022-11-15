import java.util.Arrays;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.print("Quel est votre âge ? ");
        int age=keyboardInput.nextInt();
        int anneeDeNaissance=2022 - age;

        System.out.printf("Votre année de naissance est %d", anneeDeNaissance);
    }
}
