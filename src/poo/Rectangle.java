package poo;

public class Rectangle {
    private double longueur;
    private double largeur;

    // getters : accesseurs -> permet d'accéder aux attributs
    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }

    // setters : manipulateurs -> permet de modifier les attributs
    public void setLongueur(double nouvelleValeur) {
        if (nouvelleValeur > 0) {
            longueur=nouvelleValeur;
        } else {
            System.out.println("La longueur doit toujours être un nombre positif");
        }
    }

    public void setLargeur(double nouvelleValeur) {
        if (nouvelleValeur > 0) {
            largeur=nouvelleValeur;
        } else {
            System.out.println("La largeur doit toujours être un nombre positif");
        }
    }

    public double calculSurface() {
        return longueur * largeur;
    }

    public double calculPerimetre() {
        return 2 * (longueur + largeur);
    }
}
