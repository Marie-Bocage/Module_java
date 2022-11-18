package poo;

public class Surcharge {
    public static int somme(int nombre1, int nombre2) {
        return nombre1 + nombre2;
    }

    public static int somme(int...nombres) { // Permet d'entrer autant de paramètres que l'on veut.
        int resultat=0;
        for (int nombre:nombres) {
            resultat += nombre;
        }
        return resultat;
    }

    public static void main(String[] args) {
        System.out.println(somme(5,6));
        System.out.println(somme(5,7,6,4,2,9,8,7,8,5,6,9));
    }
}
