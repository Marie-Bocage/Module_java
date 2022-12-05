package notionsDeBase;

public class Point9_TableauStatique {
    public static void main(String[] args) {
        double[] notesCoursPhysique=new double[5]; // Permet de préciser taille du tableau

        notesCoursPhysique[0]=12.5;
        notesCoursPhysique[1]=15;
        notesCoursPhysique[2]=17;
        notesCoursPhysique[3]=8;
        notesCoursPhysique[4]=11;

        for (int i = 0; i <= 4; i++) {
            System.out.println(notesCoursPhysique[i]);
        }

// 1. Permettre à l'utilisateur de définir le nombres des notes à stocker
//        - La valeur doit toujours être > 0
// 2. Permettre à l'utilisateur d'entrer les notes du tableau à partir du clavier
//        - Les valeurs ne doivent être qu'entre 0 et 20
// 3. Calculer et afficher la moyenne


    }
}
