package poo;

public class Etudiant { // clic droit -> generate -> constructor / getters and setters
    private String nom;
    private String prenom;
    private String pays;
    private boolean marie;

    public Etudiant(String nom, String prenom, String pays, boolean marie) {
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        this.marie = marie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public boolean isMarie() {
        return marie;
    }

    public void setMarie(boolean marie) {
        this.marie = marie;
    }
}
