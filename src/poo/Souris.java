package poo;

public class Souris {
    // Attributs
    private int poids;
    private int age;
    private String couleur;
    private int esperanceVie;
    private boolean estClonee; // Convention le nom d'un booléen doit être sous forme de questions.

    // Constructeur cosntante
    public static final int ESPERANCE_VIE_DEFAUT=36;

    // Constructeurs
    public Souris(int poids, String couleur) {
        this.poids=poids;
        this.couleur=couleur;
        this.age=0;
        this.esperanceVie=ESPERANCE_VIE_DEFAUT;
        this.estClonee=false;

        System.out.println("Une nouvelle souris !");
    }

//    // Constructeur par défaut
//    public Souris() {
//        age=0;
//
//        System.out.println("Une nouvelle souris !");
//    }

    // Constructeur copie
    public Souris(Souris souris) {
        this.poids=souris.poids;
        this.couleur=souris.couleur;
        this.age=souris.age;
        this.esperanceVie=(int)(0.8 * (double)souris.esperanceVie);
        this.estClonee=true;

        System.out.println("Clonage d'une souris !");
    }

    // Getters
    public int getPoids(){
        return poids;
    }

    public String getCouleur(){
        return couleur;
    }

    public int getAge(){
        return age;
    }

    public int getEsperanceVie(){
        return esperanceVie;
    }

    public boolean getClonee(){
        return estClonee;
    }

    // Setters
    public void setPoids() {
        if (poids > 0) {
            this.poids=poids;
        } else {
            System.out.println("Le poids doit être supérieur à 0.");
        }
    }

    public void setCouleur() {
        this.couleur=couleur;
    }

    public void setAge() {
            this.age=age;
    }

    public void setEsperanceVie() {
            this.esperanceVie=esperanceVie;
    }

    public void setClonee() {
        this.estClonee=estClonee;
    }

    // Méthode toString
    public String toString() {
        if (this.estClonee == false) {
            return String.format("Une souris %s, de %d mois et pesant %d grammes.", this.couleur, this.age, this.poids);
        }
        return String.format("Une souris %s, clonée, de %d mois et pesant %d grammes.", this.couleur, this.age, this.poids);
    }

    public void vieillir(){
        this.age += 1;
        if (this.estClonee && this.age > this.esperanceVie/2) {
            this.couleur="verte";
        }
    }

    public void evolue() {
        while (this.age < this.esperanceVie) {
            this.vieillir();
        }
    }
}
