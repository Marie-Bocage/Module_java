package poo;

public class MainSouris {
    public static void main(String[] args) {
        Souris testSouris=new Souris(5,"grise");
        System.out.println(testSouris);

        Souris sourisCopie=new Souris(testSouris);
        System.out.println(sourisCopie);

        testSouris.evolue();
        System.out.println(testSouris);

        sourisCopie.evolue();
        System.out.println(sourisCopie);
    }
}
