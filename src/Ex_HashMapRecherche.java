import java.util.HashMap;
import java.util.Scanner;

public class Ex_HashMapRecherche {
    public static void main(String[] args) {
        int[] nombres=new int[]{2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 1, 32, 1};

        // 1. Créer un HashMap vide
        HashMap<Integer, Integer> occurrence = new HashMap<>();

        // 2. Remplir le hashMap avec les nombres et leurs occurrences
        for (int nombre : nombres) {
            if (occurrence.containsKey(nombre)) {
                int nombreMiseAJour = occurrence.get(nombre) + 1;
                occurrence.replace(nombre, nombreMiseAJour);
            } else {
                occurrence.put(nombre, 1);
            }
        }
//        System.out.println(occurrence);

        var input=new Scanner(System.in);
        System.out.println("Entrez le nombre à rechercher : ");
        var nombreARechercher=input.nextInt();

        if (occurrence.containsKey(nombreARechercher)) {
            System.out.printf("%d se retrouve %d fois dans la liste.",
                    nombreARechercher, occurrence.get(nombreARechercher));
        } else {
            System.out.printf("%d n'existe pas dans la liste.", nombreARechercher);
        }
    }
}
