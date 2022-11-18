package poo;

public class Souris {
    // Attributs
    private int poids;
    private int age;
    private String couleur;
    private int esperanceVie;
    private boolean clonee;

    // Constructeur cosntante
    public static final int ESPERANCE_VIE_DEFAUT=36;

    // Constructeurs
    public Souris(int poids, String couleur) {
        this.poids=poids;
        this.couleur=couleur;
        this.age=age;
        this.esperanceVie=ESPERANCE_VIE_DEFAUT;
        this.clonee=false;

        System.out.println("Une nouvelle souris !");
    }

    // Constructeur par défaut
    public Souris() {
        age=0;

        System.out.println("Une nouvelle souris !");
    }

    // Constructeur copie
    public Souris(Souris souris) {
        this.poids=souris.poids;
        this.couleur=souris.couleur;
        this.age=souris.age;
        this.esperanceVie=(int)(0.8 * (double)souris.esperanceVie);
        this.clonee=true;

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
        return clonee;
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
        this.clonee=clonee;
    }

    // Méthode toString
    public String toString() {
        if (clonee == false) {
            return String.format("Une souris %s, de %d mois et pesant %d grammes.", couleur, age, poids);
        } else {
            return String.format("Une souris %s, clonée, de %d mois et pesant %d grammes.", couleur, age, poids);
        }
    }

    public void vieillir(){
        age += 1;
        if (clonee == true && age > esperanceVie/2) {
            couleur="verte";
        }
    }

    public void evolue() {
        while (age < esperanceVie) {
            this.vieillir();
        }
    }
}
