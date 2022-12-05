package notionsDeBase;

public class Point19_Fonctions {
    public static String reverseString(String str){ // Premier String => type à la sortie; Deuxième String => String à l'entrée
        String reversed="";
        for (String letter:str.split("")) {
            reversed = letter + reversed;
        }
        return reversed;
    }

    public static String formatStr(String str) {
        String formatted=str.replaceAll("[^A-Z-a-z]", "").toLowerCase();
        return formatted;
    }

    public static boolean isPalindrome(String phrase) {
        String text=formatStr(phrase);
        return text.equals(reverseString(text));
    }

    public static int calculSomme(int nombre1, int nombre2) {
        return nombre1 + nombre2;
    }

    public static double calculSurfaceCercle(double rayon) {
        return Math.pow(rayon,2) * Math.PI;
    }

    public static int sommeTableau(int[] nombres) {
        int somme=0;
        for (int nombre:nombres) {
            somme+=nombre;
        }
        return somme;
    }

    public static void main(String[] args) {
        String chaine1="Papy et Mamy";
        String chaine1Formatted=formatStr(chaine1);
        System.out.println(chaine1Formatted);

        String chaine1Reversed=reverseString(chaine1Formatted);
        System.out.println(chaine1Reversed);

        System.out.println(isPalindrome(chaine1));
        System.out.println(isPalindrome("non"));
        System.out.println(isPalindrome("Whallou"));

    }
}
