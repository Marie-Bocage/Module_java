package tpDeValidation;

import java.util.Scanner;
import java.util.StringJoiner;

public class Tp9 {
    public static boolean maMethode(String motNonFormate) {
        String mot=motNonFormate.replaceAll(" ","").toLowerCase();
        System.out.println(mot);
        int i =0;
        while (i != mot.length() - 1) {
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
        String mot=keyboardInput.nextLine();

        System.out.println(maMethode(mot));
    }
}
