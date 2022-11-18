package poo;

public class MainSouris {
    public static void main(String[] args) {
        Souris testSouris=new Souris(5,"bleu",2,5);
        System.out.println(testSouris);

        Souris sourisCopie=new Souris(testSouris);
        System.out.println(sourisCopie);
    }
}
