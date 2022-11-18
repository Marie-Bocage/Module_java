package poo;

public class Test {
//    public static double calculSurface(double longueur, double largeur) {
//        return longueur * largeur;
//    }
//
//    public static double calculPerimetre(double longueur, double largeur) {
//        return 2 * (longueur + largeur);
//    }

    public static void main(String[] args) {
//        double longueur=45.5;
//        double largeur=25.2;
//        double rayon=78;
//        double vitesse=35;
//
//        double surface=calculSurface(longueur, largeur);
//        double perimetre=calculPerimetre(longueur, largeur);
//        System.out.printf("Surface : %.3f\n", surface);
//        System.out.printf("Périmètre : %.3f\n", perimetre);

//        Rectangle rect=new Rectangle(400, 350);
//
//        System.out.printf("Longueur avant setter : %.1f\n", rect.getLongueur());
//        System.out.printf("Largeur avant setter : %.1f\n", rect.getLargeur());
////        rect.setLongueur(250.5);
////        rect.setLargeur(120);
//        System.out.printf("Largeur : %.1f\n", rect.getLargeur());
//        System.out.printf("Longueur : %.1f\n", rect.getLongueur());
//        System.out.printf("Surface : %.1f\n", rect.calculSurface());
//        System.out.printf("Perimetre : %.1f", rect.calculPerimetre());

        Patient patient=new Patient(63.0,1.70);

        System.out.printf("IMC : %.1f\n", patient.calculImc());
        System.out.println(patient.affichageDonnees());

        System.out.println(patient.getPoids());
        System.out.println(patient.getTaille());
    }
}
