public class Exo_1 {
    public static void main(String[] args) {
        int longueur=250;
        int largeur=140;

        int surface=longueur * largeur;
        int perimetre=2 * (longueur + largeur);

        System.out.printf("Longueur : %d m\nLargeur : %d m\nSurface : %d m²\nPerimètre : %d m", longueur,
                largeur, surface, perimetre);
    }
}
