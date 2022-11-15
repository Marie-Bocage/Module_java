import javax.security.sasl.SaslClient;
import javax.swing.*;
import java.util.Scanner;

public class Point4_Condition {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Votre âge : ");
        int age=keyboardInput.nextInt();

        if(age>=18){
            System.out.println("Vous êtes un majeur.");
        }else{
            System.out.println("Vous êtes mineur.");
        }
    }
}
