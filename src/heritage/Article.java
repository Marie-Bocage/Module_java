package heritage;

public class Article {
    private int numeroRef;
    private String nom;
    private double prix;
    private int quantite;

    public Article(int numeroRef, String nom, double prix, int quantite) {
        this.numeroRef = numeroRef;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public int getNumeroRef() {
        return numeroRef;
    }

    public void setNumeroRef(int numeroRef) {
        this.numeroRef = numeroRef;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Article{" +
                "numeroRef=" + numeroRef +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }
}
