import java.util.Scanner;

public class Point17_CharString {
    public static void main(String[] args) {
//        String nom="Marie Bocage";
        var input=new Scanner(System.in);
        System.out.print("Votre pays : ");
        String pays=input.nextLine();

        System.out.print("Votre genre : ");

        char genre=input.next().charAt(0);
        System.out.printf("Nom : %s\nGenre : %c\n", pays, genre);

        String monPays="France";

        for (int i = 0; i < monPays.length(); i++) {
            System.out.println(monPays.charAt(i));
        }
    }
}
