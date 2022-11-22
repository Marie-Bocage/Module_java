package tpDeValidation;

import java.util.Scanner;
import java.util.StringJoiner;

public class Tp9 {
    public static boolean maMethode(String mot) {
        System.out.println(mot);
        int i =0;
        while (i != mot.length() - 1) {

            System.out.println(mot.charAt(i));
            if (mot.charAt(i) == mot.charAt(i+1)) {
                return true;
            } else {
                i += 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        System.out.print("Veuillez saisir le premier mot : ");
        String motNonForma=keyboardInput.nextLine();
        String motFormatted=motNonForma.replaceAll(" ","").toLowerCase();

        System.out.println(maMethode(motFormatted));
    }
}
