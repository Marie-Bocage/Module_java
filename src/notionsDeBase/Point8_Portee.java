package notionsDeBase;

public class Point8_Portee {
    public static void main(String[] args) {
        for (var i = 0; i <= 10; i++) {
            System.out.println(i);
        } // Portee de la variable correspond à l'ensemble des instructions ou elle est visible. Boucles ont accès à leur
        // envi- ext mais les variables déclarées à l'int des boucles ne sont pas visibles à l'ext.
//        System.out.println(i); // i n'a pas été déclaré en dehors de la boucle for
    }
}
