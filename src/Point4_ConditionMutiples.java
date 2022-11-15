import java.util.Scanner;

public class Point4_ConditionMutiples {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Veuillez sélectionner une langue : ");
        String langue=keyboardInput.nextLine();
        langue=langue.toLowerCase();

        if(langue.equals("français")){
            System.out.println("Bonjour!");
        }else if(langue.equals("anglais")){
            System.out.println("Hello!");
        }else if(langue.equals("allemand")){
            System.out.println("Guten Tag");
        }else if(langue.equals("espagnol")) {
            System.out.println("Hola!");
        }else{
            System.out.println("langue non supportée");
        }
    }
}
