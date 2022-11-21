package heritage;

import java.util.ArrayList;

public class MainArticle {
    public static void main(String[] args) {
        var article1=new Article(1456,"Article 1",29.99,5);
        var article2=new Article(236,"Article 2",12.56,15);
        var article3=new Article(455, "Article 3", 5.30,25);
        ArrayList<Article> mesArtciles=new ArrayList<>();
        mesArtciles.add(article1);
        mesArtciles.add(article2);

//        for (int i = 0; i < mesArtciles.size(); i++) {
//            System.out.println(mesArtciles.get(i));
//        }
        var stock=new Program(mesArtciles);

        // Test reférence
//        System.out.println(stock.searchArticle(122));

        // Test ajout article
//        stock.ajoutArticle(article3);
//        System.out.println(stock);

        // Test Suppression article par ref
//        stock.supprimerArticle(1456);
//        System.out.println(stock);

        // Modifier un article par référence
        System.out.println(stock);
        stock.modifierArticle(236, 123);
        System.out.println(stock);

    }
}
