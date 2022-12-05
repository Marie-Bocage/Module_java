package tp2NotionsDeBase;

public class Tables {

    // Écrivez un programme tp2NotionsDeBase.Tables.java affichant les tables de multiplication de 2 à 10.
    // Votre programme devra produire la sortie suivante à l’écran :
    // tp2NotionsDeBase.Tables de multiplication
    // Table de 2 :
    // 1 * 2 = 2
    // ...
    // 10 * 2 = 20
    // ...
    // Table de 5 :
    // 1 * 5 = 5
    // 2 * 5 = 10
    // ... ...
    // Table de 10 :
    // 1 * 10 = 10 …
    public static void main(String[] args) {
        System.out.println("tp2NotionsDeBase.Tables de Multiplication");

        for (int i = 2; i <= 10; i++) {
            System.out.printf("\nTable de %d :\n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("1 * %d = %d\n", i, i * j);
            }
        }
    }
}
