package exoNotionsDeBase;

public class ExoLongueurLargeur {

    // Enoncé : Ecrire un programme Java qui déclare une longueur et une largeur et qui ensuite calcul le périmètre et la surface.
    // Le résultat est affiché dans la format suivant:
    // longueur : 250 m
    // largeur: 140 m
    // Surface : 35000m2
    // Perimetre : 780 m

    public static void main(String[] args) {
        int longueur=250;
        int largeur=140;

        int surface=longueur * largeur;
        int perimetre=2 * (longueur + largeur);

        System.out.printf("Longueur : %d m\nLargeur : %d m\nSurface : %d m²\nPerimètre : %d m", longueur,
                largeur, surface, perimetre);
    }
}
