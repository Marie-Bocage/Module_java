package poo;

public class Souris {
    // Attributs
    private int poids;
    private int age;
    private String couleur;
    private int esperanceVie;
    private String clonee;

    // Constructeurs
    public Souris(int poids, String couleur, int age, int esperanceVie) {
        this.poids=poids;
        this.couleur=couleur;
        this.age=age;
        this.esperanceVie=esperanceVie;

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
        this.esperanceVie=souris.esperanceVie;

        System.out.println("Une nouvelle souris !");
    }

    // Constructeur cosntante
    public static final int ESPERANCE_VIE_DEFAUT=36;


}
